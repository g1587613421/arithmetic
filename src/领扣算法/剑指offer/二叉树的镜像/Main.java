/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.二叉树的镜像;

import 领扣算法.剑指offer.TreeNode;

public class Main {
    TreeNode middle;
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null)
            return root;
        middle=root.left;
        root.left=root.right;
        root.right=middle;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
