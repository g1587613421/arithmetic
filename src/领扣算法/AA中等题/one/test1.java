package 领扣算法.AA中等题.one;

public class test1 {
//    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//    示例：
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807
//


    //功能测试代码
    public static void main(String arg[]){//main--来自高金磊
        ListNode l1,l2;
        l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        test1 t=new test1();
        t.addTwoNumbers(l1, l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result=null;
       ListNode r=null;//除第一次外r是低位,r.next是高位
        int value=0;
        while (l1!=null||l2!=null) {
            if (result == null) {
                value=l1.val + l2.val;
                r=result = new ListNode(value % 10);
                result.next = new ListNode(value / 10);
                l1 = l1.next;
                l2 = l2.next;

            } else {
                r=r.next;
                value = ((l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0))+r.val;
                r.val = value % 10;
                r.next = new ListNode(value / 10);
                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
            }
        }
        r.next=r.next.val==0?null:r.next;
        return result;
    }
}
