/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.排序链表;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode sortList(ListNode head) {
        LinkedList<ListNode> result=new LinkedList<>();
        while (head!=null)
        {
            result.add(head);
            head=head.next;
        }
        Collections.sort(result,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        head=result.peek();
        while (result.size()!=0){
            result.poll().next=result.peek();
        }
        return head;
    }
}
