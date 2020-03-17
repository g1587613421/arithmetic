/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.找出克隆二叉树中的相同节点;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


class Main {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned==null)
            return null;
        if (target.val==cloned.val)
            return cloned;
        TreeNode middle=getTargetCopy(original, cloned.left,target);
        return middle==null?getTargetCopy(original, cloned.right, target):middle;
    }
}