/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.单值二叉树;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
     int target=Integer.MAX_VALUE;
    public boolean isUnivalTree(TreeNode root) {
        if (root==null)
            return true;
        if (target==Integer.MAX_VALUE)
        target=root.val;
        return target==root.val&&isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
