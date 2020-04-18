/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.环形链表II;

import java.util.HashSet;

public class Main {

    public ListNode detectCycle(ListNode head) {
        if (head==null)
            return null;
        HashSet<ListNode> hashSet=new HashSet<>();
        hashSet.add(head);
        while (head.next!=null){
            if (hashSet.contains(head.next))
                return head.next;
            head=head.next;
            hashSet.add(head);
        }
        return null;
    }

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
