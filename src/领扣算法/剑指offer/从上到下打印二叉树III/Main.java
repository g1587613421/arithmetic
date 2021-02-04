/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.从上到下打印二叉树III;

import 领扣算法.剑指offer.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new LinkedList<>();
        LinkedList<List<Integer>> result=new LinkedList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();
        LinkedList<TreeNode> middle=new LinkedList<>();
        nodes.addLast(root);
       while (!nodes.isEmpty())
       {
           LinkedList<Integer> res=new LinkedList<>();
           while (!nodes.isEmpty())
           {
               TreeNode treeNode;
               treeNode=nodes.pollFirst();
               res.addLast(treeNode.val);
               if (treeNode.left!=null)
                   middle.addLast(treeNode.left);
               if (treeNode.right!=null)
                   middle.addLast(treeNode.right);
           }
           nodes.addAll(middle);
           middle.clear();
           result.add(res);
       }
       int n=0;
        for (List<Integer> list : result) {
            LinkedList<Integer> mm=new LinkedList<>();
            if (n++%2==1) {
                for (Integer integer : list) {
                    mm.addFirst(integer);
                }
                list.clear();
                list.addAll(mm);
            }
        }
        return result;
    }
}
