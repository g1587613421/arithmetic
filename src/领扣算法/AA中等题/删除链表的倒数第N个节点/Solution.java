package 领扣算法.AA中等题.删除链表的倒数第N个节点;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f=head,h=head;
        while (h.next!=null)
        {
            h=h.next;
            if (n==0?true:n--==0){
                f=f.next;
            }
        }
        if (n!=0)//长度不足以删除
        {
            return head.next;
        }
        try {
            f.next=f.next.next;
        }
        catch (Exception e){
            head=null;
        }

        return head;
    }
}
