package 领扣算法.A简单题.反转链表;

public class Main {


    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode node,node1=null;
            while (head.next!=null){
              node=head;
              head=head.next;
              node.next=node1;
              node1=node;
            }
           head.next=node1;
            return head;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
