/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.List.MyJavaClass.MyLinkList;

public class MyLinkListClass<T> implements MyLinkList {


    private MyNode head=new MyNode<Integer>();//这里往往用来存储长度不过为了方便写
    int size=0;
    private MyNode tail=new MyNode();
    void init(MyNode node){
        head.setNext(node );
        tail.setNext(node);
        size++;
    }
    @Override
    public void add(Object data) {
        addLast(data);
    }

    @Override
    public void addFirst(Object data) {

        if (isEmpty())
            init(new MyNode(data));
        else {
            MyNode myNode=new MyNode(data);
            myNode.setNext(head.getNext());
            head.setNext(myNode);
        }
        size++;
    }

    @Override
    public void addLast(Object data) {

        MyNode myNode = new MyNode<T>();
        myNode.setValue(data);
        if (isEmpty()){
            init(myNode);
            return;
        }
        size++;
        tail.getNext().setNext(myNode);
        tail.setNext(myNode);
    }

    @Override
    public void addAll(MyLinkListClass linkList) {//浅拷贝

        if (isEmpty()){
            head=linkList.head;
            tail=linkList.tail;
        }
        size+=linkList.size;
        tail.getNext().setNext(linkList.getHead().getNext());
        tail.setNext(linkList.getTail().getNext());
    }

    @Override
    public Object poll()  {
        return pollFrist();
    }

    @Override
    public Object pollFrist()  {
        MyNode node;
        if (isEmpty())
            return null;
        else {
            node = head.getNext();
            head.setNext(head.getNext().getNext());
        }
        size--;
        return node.getValue();
    }

    @Override
    public Object pollLast() {
        MyNode node;
        if (isEmpty())
            return null;
        node=new MyNode();
        node.setNext(head.getNext());
        while (node.getNext().getNext()!=null)
            node.setNext(node.getNext().getNext());
        tail.setNext(node);
        node=node.getNext();
        tail.getNext().setNext(null);
        size--;
        return node.getValue();
    }

    @Override
    public Object peek() {
        return size==0?null:head.getNext().getValue();
    }

    @Override
    public int remove(Object data) {
        MyNode node=new MyNode();//指针影子
        node.setNext(head);
        MyNode node1=new MyNode();
        node1.setNext(head.getNext());
        int i=0;
        while (node1!=null&&node1.getValue()!=data)
        {
            node=node1;
            node1=node1.getNext();
            i++;
        }
        if (node1==null)
            return -1;
        node.setNext(node1.getNext());
        size--;
        return i;
    }

    @Override
    public int getindex(Object data) {
        int i=0;
        MyNode node=head.getNext();
        while (node!=null&&node.getValue()!=data)
        {
            i++;
            node.setNext(node.getNext());
        }
        return node==null?-1:i;
    }

    @Override
    public Object get(int index) {
        if (index>size-1)
            return null;
        MyNode node=head.getNext();
        while (index-->0){
            node=node.getNext();
        }
        return node.getValue();

    }

    @Override
    public boolean insert(Object data, int index) {
        if (index>size-1)
            return false;
        if (index==0)
            addFirst(data);
        if (index==size-1)
            addLast(data);
        //中间通用情况
        MyNode node=head.getNext();
        while (index-->1){
            node.setNext(node.getNext());
        }
        MyNode target=new MyNode<T>((T)data);
        target.setNext(node.getNext());
        node.setNext(target);
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return  size==0;
    }

    @Override
    public Object[] getDatas() {
        Object[] data=new Object[size];
        MyNode myNode=head.getNext();
        for (int i = 0; i < size; i++) {
            data[i]=myNode.getValue();
            myNode.setNext(myNode.getNext());
        }
        return data;
    }
    public MyNode getHead() {
        return head;
    }

    public MyNode getTail() {
        return tail;
    }
}
