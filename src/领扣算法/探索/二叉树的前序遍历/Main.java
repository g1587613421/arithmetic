/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉树的前序遍历;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        plus(root);
        return res;
    }

    private void plus(TreeNode root) {
        if (root==null)
            return;
        res.addLast(root.val);
        plus(root.left);
        plus(root.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
