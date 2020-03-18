/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.修剪二叉搜索树;

 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root==null)
            return null;
        if (root.val<L){
            return trimBST(root.right,L,R );
        }
        if (root.val>R){
            return trimBST(root.left, L, R);
        }
        root.left=trimBST(root.left, L, R);
        root.right=trimBST(root.right, L, R);
        return root;
    }
}