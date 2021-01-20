/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.删除链表的节点;

public class Main {

    public ListNode deleteNode(ListNode head, int val) {
        if (head==null)
            return null;
        if (head.val==val)
            return head.next;
        ListNode middle=head.next;
        ListNode shadow=head;
        while (middle!=null&&middle.val!=val)
        {
            shadow=middle;
            middle=middle.next;
        }
        shadow.next=middle.next;
        return head;

    }
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
