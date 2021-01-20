/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.二叉树的深度;

public class Main {
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        int res=1;
        res+=Math.max(maxDepth(root.left),maxDepth(root.right));
        return res;
    }

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
