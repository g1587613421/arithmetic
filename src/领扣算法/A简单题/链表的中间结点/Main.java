/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.链表的中间结点;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Main {
    public ListNode middleNode(ListNode head) {
        ListNode middle=head;
        while (head!=null&&head.next!=null){
            middle=middle.next;
            head=head.next.next;
        }
        return middle;
    }
}