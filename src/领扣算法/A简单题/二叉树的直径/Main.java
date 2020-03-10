/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的直径;

import java.util.LinkedList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    int max=0;
    LinkedList<TreeNode> data=new LinkedList<>();
    public int diameterOfBinaryTree(TreeNode root) {
        data.addLast(root);
        while (data.peek()!=null){
            root=data.poll();
            max=Math.max(max, root==null?0:((root.right==null?0:plus(root.right, 0))+(root.left==null?0:plus(root.left, 0))));
        }
        return max;
    }
    private int plus(TreeNode ro,int dp){
        if (!data.contains(ro))
            data.addLast(ro);
       return Math.max(ro.left==null?dp+1:plus(ro.left,dp+1), ro.right==null?dp+1:plus(ro.right, dp+1));
    }
}