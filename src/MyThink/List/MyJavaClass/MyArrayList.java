/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.List.MyJavaClass;

public interface MyArrayList<T> {

  <T> boolean expansion();//扩容失败返回false;
  <T> void add(T data);
  <T> void addFirst(T data);
  <T> void addLast(T data);
  <T> void addAll(MyArrayList arrayList);
  <T> T poll() throws Exception;
  <T> T pollFrist() throws Exception;
  <T> T pollLast() throws Exception;
  <T> T peek();
  <T> int remove(T data);
  <T> int removeAll(MyArrayList arrayList);
  <T> int getindex(T data);
  <T> T get(int index);
  <T> boolean insert(T data,int index);
  <T> int size();
  <T> boolean isEmpty();

  <T> T[] getDatas();
}
