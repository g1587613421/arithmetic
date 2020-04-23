/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉树的最近公共祖先;

import java.util.LinkedList;

public class Main {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        LinkedList<TreeNode> data=new LinkedList<>();
        data.add(root);
        while (!data.isEmpty())
        {
            TreeNode mm=data.pollFirst();
            if (plus(mm, p)&&plus(mm, q)){
                res=mm;
                data.addFirst(mm.left);
                data.addFirst(mm.right);
            }

        }
        return res;
    }
    boolean plus(TreeNode ro,TreeNode p){
        if (ro==null)
            return false;
        if (ro==p)
            return true;
        return plus(ro.right, p)||plus(ro.left, p);
    }


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
}
