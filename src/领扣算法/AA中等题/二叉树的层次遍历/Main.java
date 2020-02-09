/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树的层次遍历;

import java.util.*;

public class Main {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> res=new ArrayList<>();
    List<TreeNode> data=new LinkedList<>(),middle=new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root!=null)
            data.add(root);
        while (!data.isEmpty()){
            res=new ArrayList<>();
            for (TreeNode datum : data) {
                if (datum==null)
                    continue;
                res.add(datum.val);
                if (datum.left!=null)
                middle.add(datum.left);
                if (datum.right!=null)
                middle.add(datum.right);
            }
            data=middle;
            middle=new LinkedList<>();
            result.add(res);
            res=new ArrayList<>();
        }
        return result;
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
