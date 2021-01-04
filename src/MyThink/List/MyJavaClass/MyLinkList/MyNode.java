/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.List.MyJavaClass.MyLinkList;

public class MyNode<T> {
    private T value;
    private MyNode next;
    private MyNode pre;//不能使用
    MyNode(){
        super();
    }
    MyNode(T data){
        this();
        this.setValue(data);
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }


}
