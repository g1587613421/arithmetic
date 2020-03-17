/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉搜索树的范围和;

import java.util.LinkedList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int res=0;
        if (root==null)
            return 0;

        LinkedList<TreeNode> middle=new LinkedList<>();
        middle.addFirst(root);
        while (!middle.isEmpty()){
            TreeNode node=middle.pollFirst();
            if (node.val>=L&&node.val<=R) {
                res += node.val;
                if (node.left!=null)
                    middle.addFirst(node.left);
                if (node.right!=null)
                    middle.addFirst(node.right);
                continue;
            }
            if (node.val<L&&node.right!=null)
                middle.addFirst(node.right);
            if (node.val>R&&node.left!=null)
                middle.addFirst(node.left);
        }
        return res;
    }
}