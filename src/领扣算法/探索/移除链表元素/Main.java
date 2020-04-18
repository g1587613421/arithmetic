/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.移除链表元素;

public class Main {

    public ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return head;
        while (head!=null&&head.val==val)
            head=head.next;
        ListNode res=head;
        while (res!=null&&res.next!=null){
            if (res.next.val==val){
                res.next=res.next.next;
            }
            else {
                res=res.next;
            }
        }
        return head;
    }



  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
