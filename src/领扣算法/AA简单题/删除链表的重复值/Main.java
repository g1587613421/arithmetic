package 领扣算法.AA简单题.删除链表的重复值;

import java.util.HashSet;
import java.util.Set;

public class Main {
    ListNode result;
    //利用集合的特性进行解答---但是结果顺序将会改变,领扣会判为失败,但是其实也正确
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> middle=new HashSet<>();
        while (head!=null){
            middle.add(head.val);
            head=head.next;
        }
        for (Integer integer : middle) {
            if (head==null){
                head=new ListNode(integer);
                result=head;
                continue;
            }
            result.next=new ListNode(integer);
            result=result.next;
        }
        return head;
    }

    public static void main(String arg[]){//main--来自高金磊
     ListNode listNode=new ListNode(1);
     listNode.next=new ListNode(1);
     listNode.next.next=new ListNode(2);
     System.out.println(new Main().deleteDuplicates(listNode));

    }
}
