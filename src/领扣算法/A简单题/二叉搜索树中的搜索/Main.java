/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉搜索树中的搜索;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public TreeNode searchBST(TreeNode root, int val) {
        return root==null?null:(root.val==val?root:(root.val>val?(searchBST(root.left, val)):searchBST(root.right, val)));
    }
}