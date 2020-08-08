/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.统计二叉树中好节点的数目;

public class Main {
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  int count=0;
    public int goodNodes(TreeNode root) {
        //Depth search
        plus(root,Integer.MIN_VALUE);
        return count;
    }

    private void plus(TreeNode root, int val) {
        if (root==null){
            return;
        }
        if (root.val>-val){
            count++;
            val=root.val;
        }
        plus(root.left, val);
        plus(root.right, val);
    }

}
