package 领扣算法.AA中等题.删除链表中重复出现的数字;

import java.util.HashMap;

public class Main {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }





      HashMap<Integer,Integer> data=new HashMap<>();
    public ListNode deleteDuplicates(ListNode head) {

          while (head!=null){
              if (data.containsKey(head.val)){
                  data.put(head.val, data.get(head.val)+1);
              }
              else {
                  data.put(head.val, 1);
              }
              head=head.next;
          }
          ListNode la=null;
        for (Integer integer : data.keySet()) {
            if (data.get(integer)!=1)
                continue;
            if(la==null){
                la=head=new ListNode(integer);
                continue;
            }

            la.next=new ListNode(integer);
            la=la.next;
        }

          return head;
    }
}
