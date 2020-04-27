/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉搜索树迭代器;

import java.util.LinkedList;

class BSTIterator {
     LinkedList<Integer> data;

    public BSTIterator(TreeNode root) {
        data = new LinkedList<>();
        plus(root);

    }

    private void plus(TreeNode treeNode){
        if (treeNode==null)
            return;
        plus(treeNode.left);
        data.add(treeNode.val);
        plus(treeNode.right);
    }
    /** @return the next smallest number */
    public int next() {
        return data.pollFirst();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !data.isEmpty();
    }


   class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
