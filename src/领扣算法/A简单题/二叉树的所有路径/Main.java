/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的所有路径;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<String> result=new LinkedList<>();
    StringBuffer middle;
    public List<String> binaryTreePaths(TreeNode root) {
        if (root==null)
            return result;
        middle=new StringBuffer();
        middle.append(root.val);
        if (root.left!=null)
            plus(root.left, new StringBuffer(middle));
        if (root.right!=null)
            plus(root.right, middle);
        if (root.right==root.left)
            result.add(middle.toString());
        return result;
    }
    void plus(TreeNode ro,StringBuffer middle){
        middle.append("->").append(ro.val);
        if (ro.left!=null)
            plus(ro.left, new StringBuffer(middle));
        if (ro.right!=null)
            plus(ro.right, middle);
        if (ro.right==ro.left)
            result.add(middle.toString());
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