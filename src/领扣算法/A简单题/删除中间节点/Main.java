/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.删除中间节点;

public class Main {


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


    public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;
    }
}
