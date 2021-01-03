/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.分隔链表;

public class Main {

    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode small=new ListNode(0);
            ListNode smallindex=small;
            ListNode big=new ListNode(0);
            ListNode bigindex=big;
            while (head!=null)
            {
                if (head.val<x){
                    smallindex.next=head;
                    smallindex=smallindex.next;
                }
                else {
                    bigindex.next=head;
                    bigindex=bigindex.next;
                }
                head=head.next;
            }
            smallindex.next=big.next;
            bigindex.next=null;
            return small.next;
        }
    }
}
