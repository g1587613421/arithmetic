/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树剪枝;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public TreeNode pruneTree(TreeNode root) {
        if (root==null)
            return null;
        root.left=root.left!=null?(pruneTree(root.left)):null;
        root.right=root.right!=null?(pruneTree(root.right)):null;
        if ((root.left==root.right&&root.val==0))
            return null;
        return root;
    }
}