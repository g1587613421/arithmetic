/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.叶子相似的树;

public class Main {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return plus(root1).equals(plus(root2));
    }
    private String plus(TreeNode root){
        if (root==null)
            return "";
        if (root.left==root.right){
            return ""+root.val;
        }
        return plus(root.left)+plus(root.right);


    }

}
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }