/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.扁平化多级双向链表;

import java.util.ArrayList;

public class Main {

    ArrayList<Integer> data=new ArrayList<>();
    public Node flatten(Node head) {
        plus(head);
        if (data.size()==0)
            return null;
        Node node=new Node();
        node.val=data.get(0);
        data.remove(0);
        head=node;
        for (Integer datum : data) {
            Node middle=new Node();
            middle.val=datum;
            middle.prev=node;
            node.next=middle;
            node=node.next;
        }
        return head;
    }
    private void plus(Node node){
        if (node==null)
            return;
        data.add(node.val);
        plus(node.child);
        plus(node.next);
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}
