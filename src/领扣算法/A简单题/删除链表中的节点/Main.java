/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.删除链表中的节点;

public class Main {

    public void deleteNode(ListNode node) {
        while (node.next.next!=null)
        {
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }





 class ListNode {

        int val;

        ListNode next;


        ListNode(int x) {
            val = x;
        }
    }
}
