/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉搜索树中第K小的元素;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> data=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        plus(root);
        return data.get(k-1);
    }
    private void plus(TreeNode treeNode){
        if (treeNode==null)
            return;
        plus(treeNode.left);
        data.add(treeNode.val);
        plus(treeNode.right);
    }

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
