/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉搜索树中的插入操作;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode treeNode=root;
        while (true){
            if (treeNode.val==val)
                break;
            if (val>treeNode.val)
            {
                if (treeNode.right==null){
                    treeNode.right=new TreeNode(val);
                    break;
                }
                else
                    treeNode=treeNode.right;
            }else {
                if (treeNode.left==null){
                    treeNode.left=new TreeNode(val);
                   break;
                }
                else treeNode=treeNode.left;
            }
        }
        return root;
    }
}
