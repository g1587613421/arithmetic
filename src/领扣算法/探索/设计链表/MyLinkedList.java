/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.设计链表;

class MyLinkedList {
    Node head;
    int size=0;
    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (size-1<index||index<0)
            return -1;
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node.value;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (head==null)
        {
            head=new Node(val);
            size++;
            return;
        }
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head==null)
        {
            addAtHead(val);
            return;
        }
        Node node=head;
        while (node.next!=null){
            node=node.next;
        }
        node.next=new Node(val);
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index<=0) {
            addAtHead(val);
        }
        else {
            if (index >= size)
                addAtTail(val);
            else {
                Node node = head;
                while (index--> 2)
                    node = node.next;
                Node middle = new Node(val);
                middle.next = node.next;
                node.next = middle;
                size++;
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index<0||index>=size)
            return;
        if (index==0){
            head=head.next;
            size--;
            return;
        }
        Node node=head;
        while (index-->1){
            node=node.next;
        }
        node.next=node.next.next;
    }

    class Node{
        Node next;
        int value;
        public Node(int value){
            this.value=value;
        }
    }
    
    public static void main(String arg[]){//main--来自高金磊

        
          MyLinkedList obj = new MyLinkedList();

          obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        obj.addAtIndex(3,0);
        int param_1 = obj.get(2);
        obj.deleteAtIndex(2);
         param_1 = obj.get(1);
         
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */