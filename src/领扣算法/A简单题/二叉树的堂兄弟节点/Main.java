/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的堂兄弟节点;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 class Main {
     int[] depth = new int[2];
     TreeNode[] node = new TreeNode[2];
     public boolean isCousins(TreeNode root, int x, int y) {
         helper(root, x, y, 0);
         return depth[0] == depth[1] && node[0] != node[1];
     }
     public void helper(TreeNode root, int x, int y, int d) {
         if(root == null) {
             return;
         }
         d++;
         if(root.left != null && root.left.val == x || root.right != null && root.right.val == x) {
             depth[0] = d;
             node[0] = root;
         }
         if(root.left != null && root.left.val == y || root.right != null && root.right.val == y) {
             depth[1] = d;
             node[1] = root;
         }
         helper(root.left, x, y, d);
         helper(root.right, x, y, d);
     }
}
