/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.完全二叉树的节点个数;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
     int count=0;
    public int countNodes(TreeNode root) {
        plus(root);
        return count;
    }
    void plus(TreeNode treeNode){
      if (treeNode==null)
          return;
      count++;
      plus(treeNode.left);
      plus(treeNode.right);

    }
}