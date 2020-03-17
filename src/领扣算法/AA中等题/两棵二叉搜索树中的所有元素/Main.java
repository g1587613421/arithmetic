/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.两棵二叉搜索树中的所有元素;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> da1=new LinkedList<>(),da2=new LinkedList<>(),res=new LinkedList<>();
        LinkedList<TreeNode> middle=new LinkedList<>();
        if (root1!=null)
        middle.addFirst(root1);
        while (!middle.isEmpty()){
            TreeNode treeNode=middle.pollFirst();
            if (treeNode.left==treeNode.right)
            {
                da1.addLast(treeNode.val);
                continue;
            }
            if (treeNode.right!=null){
                middle.addFirst(treeNode.right);
                treeNode.right=null;
            }
            middle.addFirst(treeNode);
            if (treeNode.left!=null){
                middle.addFirst(treeNode.left);
                treeNode.left=null;
            }

        }
        if (root2!=null)
            middle.addFirst(root2);
        while (!middle.isEmpty()){
            TreeNode treeNode=middle.pollFirst();
            if (treeNode.left==treeNode.right)
            {
                da2.addLast(treeNode.val);
                continue;
            }
            if (treeNode.right!=null){
                middle.addFirst(treeNode.right);
                treeNode.right=null;
            }
            middle.addFirst(treeNode);
            if (treeNode.left!=null){
                middle.addFirst(treeNode.left);
                treeNode.left=null;
            }
        }
        while (!da1.isEmpty()&&da2.isEmpty())
        {
            if (da1.peekFirst()<da2.peekFirst())
                res.addLast(da1.pollFirst());
            else
                res.addLast(da2.pollFirst());
            System.out.println(res.peekLast());
        }
        res.addAll(da1);
        res.addAll(da2);
        return res;

    }
}
