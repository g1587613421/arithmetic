/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.左叶子之和;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }



public class Main {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left!=null)
            left(root.left);
        if (root.right!=null){
            right(root.right);
        }

        return sum;
    }

    void left(TreeNode le){
        if (le==null)
            return;
        if (le.right==le.left)
            sum+=le.val;
        left(le.left);
        right(le.right);
    }
    void right(TreeNode rig){
        if (rig==null)
            return;
        left(rig.left);
        right(rig.right);
    }
}
