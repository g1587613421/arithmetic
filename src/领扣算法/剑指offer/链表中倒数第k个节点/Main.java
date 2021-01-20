/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.链表中倒数第k个节点;

public class Main {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode middle=head,shadow;
       while (k-->1){
           middle=middle.next;
       }
       shadow=head;
       while (middle.next!=null)
       {
           middle=middle.next;
           shadow=shadow.next;
       }
       return shadow;
    }
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
