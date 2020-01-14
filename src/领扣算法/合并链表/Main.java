package 领扣算法.合并链表;

public class Main {
    public ListNode gaomergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        if (l1.val>l2.val)
            return gaomergeTwoLists(l2, l1);
        ListNode middle=l1;
        ListNode middle2=l2;
        while (l2!=null)
        {
            while(middle.next!=null&&middle.next.val<l2.val){
               middle=middle.next;
             }
            l2=l2.next;
            middle2.next=middle.next;
            middle.next=middle2;
            middle2=l2;
        }
        return l1;
    }

    //最秀的一个答案
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }


    public static void main(String arg[]){//main--来自高金磊
    ListNode listNode1=new ListNode(1);
    listNode1.next=new ListNode(2);
    listNode1.next.next=new ListNode(3);
    listNode1.next.next.next=new ListNode(4);
    ListNode listNode2=new ListNode(1);
    listNode2.next=new ListNode(3);
    listNode2.next.next=new ListNode(4);
    listNode2.next.next.next=new ListNode(6);
    new Main().gaomergeTwoLists(listNode1, listNode2);
    }
}
