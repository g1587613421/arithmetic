package 领扣算法.交换节点;

public class Main {
    public ListNode swapPairs(ListNode head) {
        ListNode middle1,middle2,middle3;
        middle1=head.next;
        middle2=head;
        try {
            middle3=middle1.next;
            middle1.next=middle2;
            middle2.next=middle3;
            head=middle1;

        }catch (Exception e){
            return head;
        }

        return head;
    }
    public static void main(String arg[]){//main--来自高金磊
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
    new Main().swapPairs(listNode);

    }

}
