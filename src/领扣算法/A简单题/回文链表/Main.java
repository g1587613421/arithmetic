package 领扣算法.A简单题.回文链表;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Main  {
    StringBuffer middle,middle2;
    public boolean isPalindrome(ListNode head) {
        middle=new StringBuffer();
        middle2=new StringBuffer();
        while (head!=null){
            middle.append(head);
            middle2.insert(0, head.val);
            head=head.next;
        }
        return middle.toString().equals(middle2.toString());
    }

}