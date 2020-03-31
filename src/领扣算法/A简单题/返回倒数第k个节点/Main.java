/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.返回倒数第k个节点;
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Main {
    public int kthToLast(ListNode head, int k) {
        ListNode middle=head;
        while (head.next!=null){
            if (k--<=0){
                middle=middle.next;
            }
            head=head.next;
        }


        return middle.next.val;
    }
}
