/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.合并K个排序链表;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> data=new ArrayList<>();
        for (ListNode list : lists) {
            while (list!=null){
                data.add(list);
                list=list.next;
            }
        }
        if (data.isEmpty())
            return null;
        Collections.sort(data,(a,b)->(a.val-b.val));
        for (int i = 0; i < data.size()-1; i++) {
            data.get(i).next=data.get(i+1);

        }

        return data.get(0);
    }


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
