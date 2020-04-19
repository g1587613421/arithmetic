/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.复制带随机指针的链表;

import java.util.LinkedList;

public class Main {



    public Node copyRandomList(Node head) {
        Node middle=head;
        LinkedList<Node> data=new LinkedList<>();

        while (middle!=null)
        {
            data.add(new Node(head.val));
            middle=middle.next;
        }
        Node res=data.peekFirst();
        int i=0;
        while (head!=null){
            if (head.random!=null)
            data.get(i).random=data.get(head.random.val);
            head=head.next;
            if (i<data.size()-1)
                data.get(i).next=data.get(i+1);
            i++;
        }
        return res;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
