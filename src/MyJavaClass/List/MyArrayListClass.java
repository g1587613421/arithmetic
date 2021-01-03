/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyJavaClass.List;

public class MyArrayListClass<T> implements MyArrayList<T>{
    T[] datas;
    T[] middle;
    int Max_len;
    int size=0;

    public <T1>  MyArrayListClass() {
        this(4);
    }
    public <T1>  MyArrayListClass(int cap) {
        if (cap<4) {
            cap=4;
        }
        Max_len=cap;
        datas= (T[]) new Object[cap];
    }
    @Override
   synchronized public  boolean expansion() {
        try {
            middle= (T[]) new Object[Max_len*2];
        }catch (OutOfMemoryError error){
            System.out.println("内存溢出"+error.getMessage());
            return false;
        }
        for (int i = 0; i < datas.length; i++) {
            middle[i]=datas[i];
        }
        datas=middle;
        Max_len=datas.length;
        return true;
    }
    private void isOutofMemory(){
        if (size+1==Max_len){
            expansion();
        }
    }

    @Override
    public void add(Object data) {
        isOutofMemory();
       datas[size]= (T) data;
       size++;
    }

    @Override
    public void addFirst(Object data) {
        isOutofMemory();
        for (int i = size; i >0; i--) {
            datas[i]=datas[i-1];
        }
        datas[0]= (T) data;
    }

    @Override
    public void addLast(Object data) {
        add(data);
    }
    @Override
    public void addAll(MyArrayList arrayList) {
        for (Object t : arrayList.getDatas()) {
            this.add(t);
        }
    }

    @Override
    public T poll(){
        if (isEmpty()){
            return null;
        }
        T t=datas[0];
        for (int i = 0; i < --size; i++) {
            datas[i]=datas[i+1];
        }
        return t;
    }

    @Override
    public T pollFrist(){
        return poll();
    }

    @Override
    public T pollLast() {
        if (isEmpty()){
            return null;
        }
        return datas[size--];
    }

    @Override
    public T peek() {
        return datas[0];
    }

    @Override
    public int remove(Object data) {
        for (int i = 0; i < size; i++) {
            if (datas[i]==data) {
                return i;
            }
        }
        return -1;
    }
    private int count;
    @Override
    public int removeAll(MyArrayList arrayList) {
        count=0;
        for (Object data : arrayList.getDatas()) {
            if (remove(data)!=-1)
                count++;
        }
        return count;
    }

    @Override
    public int getindex(Object data) {
        datas[size]= (T) data;//哨兵
        int i;
        for (i= 0; datas[i]!=data; i++);
        return i==size?-1:i;
    }

    @Override
    public Object get(int index) {
        return index>=size?null:datas[index];
    }

    @Override
    public boolean insert(Object data, int index) {
        if (index>=size||index<0)
            return false;
        else {
            for (int i = size++; i >index; i++) {
                datas[i]=datas[i-1];
            }
            datas[index]= (T) data;
            return true;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    public T[] getDatas() {
        return datas;
    }


}
