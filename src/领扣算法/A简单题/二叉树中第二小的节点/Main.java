/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树中第二小的节点;

public class Main {

    public int findSecondMinimumValue(TreeNode root) {
        long res=plus(root.left,root.val);
        res=Math.min(plus(root.right,root.val),res);
        if (res!=Long.MAX_VALUE)
            return (int)res;
        return -1;

    }

    private Long plus(TreeNode treeNode,int num) {
        if (treeNode==null)
            return Long.MAX_VALUE;
        if (treeNode.val>num)
            return Long.valueOf(treeNode.val);
        return Math.min(plus(treeNode.left, num), plus(treeNode.right, num));
    }


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
  public static void main(String arg[]){//main--来自高金磊
        System.out.println(2147483647==Integer.MAX_VALUE);
  }
}
