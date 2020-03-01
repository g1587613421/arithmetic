/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛178;

public class third {
    String target;
    boolean f=false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        StringBuffer middle;
        middle = new StringBuffer(head.val);
        while (head.next!=null)
        {
            head=head.next;
            middle.append(head.val);
        }
        target=middle.toString();
        plus(root.left, ""+root.val);
        if (!f)
        plus(root.right, ""+root.val);
        return f;
    }

    void plus(TreeNode ro,String s){
        if (f)
            return;
        if (s.contains(target)){
            f=true;
            return;
        }
        if (ro==null)
            return;
        plus(ro.right, s+ro.val);
        plus(ro.left, s+ro.val);

    }





    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

}
