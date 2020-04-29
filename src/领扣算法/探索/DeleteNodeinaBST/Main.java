/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.DeleteNodeinaBST;

public class Main {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null)
            return root;
        TreeNode treeNode[]=find(null,root, key);
        if (treeNode[1]==null)
            return root;
        TreeNode target=plus(treeNode[1],treeNode[1].right);
        if (target==null)
        {
            if (treeNode[0]==null)
                return treeNode[1].left;
            treeNode[0].right=treeNode[0].right==treeNode[1]?null:treeNode[0].right;
            treeNode[0].left=treeNode[0].left==treeNode[1]?null:treeNode[0].left;
            return root;
        }
        target.left=treeNode[1].left;
        target.right=treeNode[1].right;
        if (treeNode[0]==null)
            return target;
        if (treeNode[0].left==treeNode[1])
        {
            treeNode[0].left=target;
        }
        else treeNode[0].right=target;
        return root;

    }
    private TreeNode[] find(TreeNode he,TreeNode ro,int key){
        if (ro==null)
            return new TreeNode[]{null,null};
        if (ro.val==key)
            return new TreeNode[]{he,ro};
        TreeNode middle1[]=find(ro, ro.left, key);
        if (middle1[0]!=null||middle1[1]!=null){
            return middle1;
        }
        else return find(ro, ro.right, key);

    }
    private TreeNode plus(TreeNode he,TreeNode treeNode){
        if (treeNode==null||treeNode.left==treeNode.right||treeNode.right==null) {
            he.left=he.left==treeNode?null:he.left;
            he.right=he.right==treeNode?null: he.right;
            return treeNode;
        }
        if (treeNode.left!=null)
            return plus(treeNode,treeNode.left);
        else return plus(treeNode,treeNode.right);
    }


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
