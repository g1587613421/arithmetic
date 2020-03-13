/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最大二叉树;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    int[] data;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        data=nums;

       return Plus(0, nums.length);
    }

    TreeNode Plus(int l,int r){
        int index=findMax(l, r);
        if (index==-1)
            return null;
        TreeNode treeNode=new TreeNode(data[index]);
        treeNode.left=Plus(l, index);
        treeNode.right=Plus(index+1, r);
        return treeNode;
    }

    int findMax(int l,int r){
        int middle=Integer.MIN_VALUE,index=-1;
        for (int i = l; i < r; i++) {
            if (middle<data[i])
            {
                middle=data[i];
                index=i;
            }

        }
        return index;
    }



}
