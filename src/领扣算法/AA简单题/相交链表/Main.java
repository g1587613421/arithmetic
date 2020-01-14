package 领扣算法.AA简单题.相交链表;

import java.util.HashSet;

public class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> data=new HashSet<>();
        while (headB!=null){
            data.add(headB);
            headB=headB.next;
        }
        while (headA!=null){
            if (data.contains(headA))
                return headA;
            else
                headA=headA.next;
        }
        return headA;
    }




}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
