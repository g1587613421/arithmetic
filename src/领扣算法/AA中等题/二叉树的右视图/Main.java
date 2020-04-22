/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树的右视图;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<Integer>();
        LinkedList<TreeNode> middle=new LinkedList<TreeNode>(),data=new LinkedList<TreeNode>();
        if (root==null)
            return res;
        data.addLast(root);
        while (data.size()!=0){
            res.addLast(data.peekLast().val);
            middle.clear();
            for (TreeNode datum : data) {
                if (datum.left!=null)
                    middle.addLast(datum.left);
                if (datum.right!=null)
                    middle.addLast(datum.right);
            }
            data.clear();
            data.addAll(middle);
        }
        return res;
    }

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
