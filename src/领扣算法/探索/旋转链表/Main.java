/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.旋转链表;

import java.util.LinkedList;

public class Main {


    public ListNode rotateRight(ListNode head, int k) {
        if (head==null)
            return head;
        LinkedList<ListNode> listNodes = new LinkedList<>();
        while (head!=null){
            listNodes.add(head);
            head=head.next;
        }
        k%=listNodes.size();
        for (int i = 0; i < k; i++) {
            listNodes.addFirst(listNodes.pollLast());
        }
        for (int i = 0; i < listNodes.size()-1; i++) {
            listNodes.get(i).next=listNodes.get(i+1);
        }
        listNodes.getLast().next=null;
        return listNodes.getFirst();
    }


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
