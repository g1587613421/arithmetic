/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.从尾到头打印链表;

import java.util.LinkedList;

public class Main {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> data=new LinkedList<>();
        while (head!=null){
            data.add(head.val);
            head=head.next;
        }
        int res[]=new int[data.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=data.pollLast();

        }
        return res;
    }
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
}
