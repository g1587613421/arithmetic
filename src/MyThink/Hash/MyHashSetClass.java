/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.Hash;

import java.util.LinkedList;

public class MyHashSetClass<T> implements MyHashSetInterface {
    private LinkedList<T>[] data;
    int size=0;
   volatile private boolean  expanding=false;// 加快扩容速度
     MyHashSetClass(){
        this(4);
    }
    MyHashSetClass(int cap){
         super();
         init_data(cap<4?4:cap);

    }
    void init_data(int size){
        data=new LinkedList[size];
        for (int i = 0; i < data.length; i++) {
            data[i]=new LinkedList<>();
        }
    }

    @Override
    public boolean contains(Object o) {
        return data[hasHashCode(o)].contains(o);
    }

    @Override
    public boolean add(Object o) {
         if (!expanding&&contains(o))
             return false;
        data[hasHashCode(o)].addFirst((T) o);
        size++;
        Expansion();//软扩容
        return true;
    }

    @Override
    public int addAll(MyHashSetInterface myHashSetInterface) {
         int middle=size;
        for (LinkedList datum : ((MyHashSetClass)myHashSetInterface).getData()) {
            add(datum);
        }
        return size-middle;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i].clear();
        }
    }

    @Override
    public boolean remove(Object o) {
         if (!contains(o))
            return false;
         data[hasHashCode(o)].remove(o);
         return true;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void Expansion() {
        if (expanding||size%data.length!=0)
            return;
        boolean flag=false;
        for (LinkedList<T> datum : data) {
            if (datum.size()>data.length){
                flag=true;
                break;
            }
        }
        if (flag){
            LinkedList middle[]= data;
            init_data(data.length*2);//自动扩容
            expanding=true;
            for (LinkedList t : middle) {
                for (Object o : t) {
                    add(o);
                }
            }
            expanding=false;
        }

    }

    @Override
    public int hasHashCode(Object o) {
//         return Math.abs(o.hashCode()%data.length);
        return (Math.abs(o.hashCode()*hashCode())/10000)%data.length;//增加随机性
    }

    public LinkedList<T>[] getData() {
        return data;
    }
}
