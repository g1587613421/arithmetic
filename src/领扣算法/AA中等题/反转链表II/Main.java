/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.反转链表II;

import java.util.LinkedList;

public class Main {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        LinkedList<ListNode> h=new LinkedList<>();
        LinkedList<ListNode> middle=new LinkedList<>();
        int i=1;
        for (; i < m; i++) {
            h.addLast(head);
            head=head.next;
        }
        for (;i <=n; i++) {
            middle.addFirst(head);
            head=head.next;
        }
        //head剩下的就是尾部
        h.addAll(middle);
        if (h.isEmpty()){
            return head;
        }
        ListNode mm=h.pollFirst();
        ListNode mmm=mm;
       while (!h.isEmpty()){
           mmm.next=h.pollFirst();
           mmm=mmm.next;
       }
       mmm.next=head;
       return mm;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
