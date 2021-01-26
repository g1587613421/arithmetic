/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.从上到下打印二叉树II;

import 领扣算法.剑指offer.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        LinkedList<TreeNode> middle=new LinkedList<>(),data=new LinkedList<>();
        if (root==null)
            return result;
        data.addLast(root);
        while (!data.isEmpty())
        {
            LinkedList<Integer> res=new LinkedList<>();
            for (TreeNode datum : data) {
                res.addLast(datum.val);
                if (datum.left!=null)
                    middle.addLast(datum.left);
                if (datum.right!=null)
                    middle.addLast(datum.right);
            }
            result.add(res);
            data.clear();
            data.addAll(middle);
            middle.clear();
        }
        return result;
    }
}
