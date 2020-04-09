/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.找树左下角的值;

import java.util.LinkedList;

public class Main {
    public int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        LinkedList<TreeNode> middle = new LinkedList<>();
        treeNodes.addLast(root);
        if (root==null)
            return -1;

        while (treeNodes.size()!=0){
            middle.clear();
            for (TreeNode treeNode : treeNodes) {
                if (treeNode.left!=null){
                    middle.addLast(treeNode.left);
                }
                if (treeNode.right!=null){
                    middle.addLast(treeNode.right);
                }
            }
            if (middle.size()>0) {
                treeNodes.clear();
                treeNodes.addAll(middle);
            }
            else {
                middle.addAll(treeNodes);
                treeNodes.clear();
            }
        }
        return middle.peekFirst().val;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
