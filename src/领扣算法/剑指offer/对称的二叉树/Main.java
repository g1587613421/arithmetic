/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.对称的二叉树;

import 领扣算法.剑指offer.TreeNode;

public class Main {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        return plus(root.left,root.right);
    }

    private boolean plus(TreeNode left, TreeNode right) {
        if (left==right)
            return true;
        if (left==null||right==null)
            return false;
        if (right.val!=left.val)
            return false;
        return plus(left.left, right.right)&&plus(left.right, right.left);
    }
}
