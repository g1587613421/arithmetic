/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.奇偶链表;

public class Main {
    public ListNode oddEvenList(ListNode head) {
        ListNode pre=head,last=head.next,middle,middle1;
        while (last!=null&&last.next!=null){
           middle=last;
           middle1=last.next;
           last=middle1.next;

        }
        return head;
    }

 static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  public static void main(String arg[]){//main--来自高金磊
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
      new Main().oddEvenList(node);
  }
}
