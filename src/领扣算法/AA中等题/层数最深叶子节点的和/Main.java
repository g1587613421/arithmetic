/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.层数最深叶子节点的和;

import java.util.HashMap;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Main {
       int min_leaf=0;
       HashMap<Integer,Integer> data=new HashMap<>();
    public int deepestLeavesSum(TreeNode root) {
        if (root!=null)
        plus(root, 0);
        return data.getOrDefault(min_leaf,0);
    }
    void plus(TreeNode treeNode,int deep){
        if (treeNode.left==treeNode.right)
        {
            min_leaf=Math.max(min_leaf, deep);
            data.put(deep, data.getOrDefault(deep, 0)+treeNode.val);
            return;
        }
        if (treeNode.left!=null)
        {
            plus(treeNode.left, deep+1);
        }
        if (treeNode.right!=null)
            plus(treeNode.right, deep+1);
    }
}