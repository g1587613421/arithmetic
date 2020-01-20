package 领扣算法.A简单题.环形链表;

public class Main {
    ListNode run1,run2;
    public boolean hasCycle(ListNode head) {
        if (head==null)
            return false;
        run1=head.next;
        run2=head;
        while (run1!=null&&run1.next!=null){
            if (run1==run2)
                return true;
            run1=run1.next.next;
            run2=run2.next;
        }
        return false;
    }
}
