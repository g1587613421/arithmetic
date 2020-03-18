/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树展开为链表;

import java.util.LinkedList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> data=new LinkedList<>();
        if (root==null)
            return;
        data.addFirst(root);
        while (!data.isEmpty()){
            TreeNode mm=data.pollFirst();
            if (mm.right!=null)
                data.addFirst(mm.right);
            if (mm.left!=null){
                mm.right=mm.left;
                mm.left=null;
                data.addFirst(mm.right);
            }
            else
            {
                mm.right=data.peekFirst();
            }
        }

    }
}