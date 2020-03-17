/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;

    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Main {
        ArrayList<Integer> res=new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            sequentialTraversal(root);
            return res;
        }
        void sequentialTraversal(TreeNode ro){
            if (ro==null)
                return;
            sequentialTraversal(ro.left);
            res.add(ro.val);
            sequentialTraversal(ro.right);
        }
}
