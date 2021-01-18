/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.重排链表;

import java.util.LinkedList;

public class Main {
    public void reorderList(ListNode head) {
        if (head==null)
            return;
        LinkedList<ListNode> data=new LinkedList<>();
        while (head!=null)
        {
            data.add(head);
            head=head.next;
        }
        ListNode[] middle=new ListNode[data.size()];
        for (int i = 0; i < middle.length; i++) {
            middle[i]=data.pollFirst();
            middle[i].next=null;
        }
        head=middle[0];
        ListNode node=head;
        for (int i = 1; i < middle.length; i++) {
            int target=0;
            if (i%2==0){
                target=i/2;
            }
            else {
                target=middle.length-i/2-1;
            }
            node.next=middle[target];
            node=node.next;
        }
    }
    
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
