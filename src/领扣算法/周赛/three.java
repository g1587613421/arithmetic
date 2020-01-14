package 领扣算法.周赛;

public class three {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode middle=new ListNode(0),middle2;
        middle.next=head;
        int sum=0;
        while (middle.next!=null){
            sum=0;
            if (middle.next==head)
                middle2=head;
                else middle2=middle.next.next;
        while (middle2!=null){
            sum+=middle2.val;
            middle2=middle2.next;
            if (sum==0){
                if (middle.next==head){
                    head=middle2;
                }
                middle.next.next=middle2;
                continue;
            }
        }
            middle.next=middle.next.next;
        }
        return head;
    }
    public static void main(String arg[]){//main--来自高金磊
     ListNode head=new ListNode(1);
     head.next=new ListNode(2);
     head.next.next=new ListNode(3);
     head.next.next.next=new ListNode(-3);
     new three().removeZeroSumSublists(head);

    }
}
