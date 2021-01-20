/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.合并两个排序的链表;

public class Main {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        ListNode res=new ListNode(0);
        ListNode midde=res;
        while (l1!=null)
        {
            int num1=l1.val;
            int num2=l2==null?Integer.MAX_VALUE:l2.val;
            if (num1<num2)
            {
                midde.next=l1;
                l1=l1.next;
            }else {
                midde.next=l2;
                l2=l2.next;
            }
            midde=midde.next;
        }
        midde.next=l2;
        return res.next;
    }
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
