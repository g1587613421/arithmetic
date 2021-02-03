/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.从上到下打印二叉树;

import 领扣算法.剑指offer.TreeNode;

import java.util.LinkedList;

public class Main {

    public int[] levelOrder(TreeNode root) {
        LinkedList<TreeNode> data=new LinkedList<>();
        LinkedList<Integer> res=new LinkedList<>();
      if (root==null)
          return new int[0];
      data.addLast(root);
      while (!data.isEmpty())
      {
          TreeNode middle=data.pollFirst();
          res.addLast(middle.val);
          if (middle.left!=null)
              data.addLast(middle.left);
          if (middle.right!=null)
              data.addLast(middle.right);
      }
      int[] result=new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=res.pollFirst();
        }
        return result;
    }
}
