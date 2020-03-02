/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二进制链表转整数;

public class Main {

    public int getDecimalValue(ListNode head) {
        StringBuffer stringBuffer=new StringBuffer();
        while (head!=null){
            stringBuffer.append(head.val);
            head=head.next;
        }

        return Integer.parseInt(stringBuffer.toString(), 2);
    }
}
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }