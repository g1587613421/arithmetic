/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.两数相加II;

import java.util.LinkedList;

public class Main {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> data1=new LinkedList<>(),data2=new LinkedList<>(),res;
        while (l1!=null){
            data1.addFirst(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            data2.addFirst(l2.val);
            l2=l2.next;
        }
        if (data1.size()<data2.size()){
            res=data1;
            data1=data2;
            data2=res;
        }
        res=new LinkedList<>();
        int flag=0;
        while (!data1.isEmpty()){
            flag+=data1.pollFirst();
            if (!data2.isEmpty())
                flag+=data2.pollFirst();
            res.addFirst(flag%10);
            flag/=10;
        }
        if (flag!=0)
            res.addFirst(flag);

        if (res.size()==0){
            return new ListNode(0);
        }
        ListNode head=new ListNode(res.pollFirst());
        ListNode middle=head;
        while (!res.isEmpty()){
            head.next=new ListNode(res.pollFirst());
            head=head.next;
        }
        return middle;
    }
}


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }