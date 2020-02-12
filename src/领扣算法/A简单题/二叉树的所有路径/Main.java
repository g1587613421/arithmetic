/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的所有路径;

import java.util.LinkedList;
import java.util.List;

public class Main {
    List<String> result=new LinkedList<>();
    StringBuffer middle;
      public List<String> binaryTreePaths(TreeNode root) {
          plus(root.left, new StringBuffer(root.val));
          plus(root.right, new StringBuffer(root.val));
          return result;

    }

void plus(TreeNode root, StringBuffer mm) {
    if (root == null)
        result.add(mm.toString());
    else {
        plus(root.left, new StringBuffer(mm.append(root.val)));
        plus(root.right, new StringBuffer(mm.append(root.val)));
    }
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