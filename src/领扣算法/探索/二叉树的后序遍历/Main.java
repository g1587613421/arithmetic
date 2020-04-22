/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉树的后序遍历;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        plus(root);
        return res;
    }

    void plus(TreeNode ro){
        if (ro==null)
            return;
        plus(ro.left);
        plus(ro.right);
        res.add(ro.val);
    }
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
