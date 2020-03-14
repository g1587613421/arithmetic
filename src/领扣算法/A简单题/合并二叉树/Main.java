/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.合并二叉树;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null)
            return t2;
        if (t2==null)
            return t1;
        plus(t1, t2);
        return t1;
    }
    void plus(TreeNode ro1,TreeNode ro2){
        if (ro2==null)
            return;
        ro1.val+=ro2.val;
        if (ro1.left==null)
            ro1.left=ro2.left;
        else plus(ro1.left, ro2.left);
        if (ro1.right==null)
            ro1.right=ro2.right;
        else plus(ro1.right, ro2.right);
    }
}