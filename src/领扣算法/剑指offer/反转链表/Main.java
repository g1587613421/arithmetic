/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.反转链表;

import java.util.LinkedList;

public class Main {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        LinkedList<ListNode> data=new LinkedList<>();
        while (head!=null)
        {
            data.addFirst(head);
            head=head.next;
            data.peekFirst().next=null;
        }
        head=data.poll();
        ListNode middle=head;
        for (ListNode datum : data) {
            middle.next=datum;
            middle=middle.next;
        }
        return head;
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
