/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.移除重复节点;

import java.util.ArrayList;

public class Main {

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null)
            return head;
        ListNode middle=head;
        ArrayList<Integer> data=new ArrayList<>();
        data.add(head.val);
        while (head.next!=null){
            if (data.contains(head.next.val))
                head.next=head.next.next;
            else {
                data.add(head.next.val);
                head=head.next;
            }
        }
        return middle;
    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}