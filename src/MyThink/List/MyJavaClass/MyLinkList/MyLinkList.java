/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.List.MyJavaClass.MyLinkList;

public interface MyLinkList<T> {
  <T> void add(T data);
  <T> void addFirst(T data);
  <T> void addLast(T data);
  <T> void addAll(MyLinkListClass linkList);
  <T> T poll() throws Exception;
  <T> T pollFrist() throws Exception;
  <T> T pollLast() throws Exception;
  <T> T peek();
  <T> int remove(T data);
  <T> int getindex(T data);
  <T> T get(int index);
  <T> boolean insert(T data, int index);
  <T> int size();
  <T> boolean isEmpty();

  <T> T[] getDatas();
}
