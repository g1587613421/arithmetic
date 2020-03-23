/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最长同值路径;


import java.util.LinkedList;

class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
     int max=0;
     LinkedList<TreeNode> data=new LinkedList<>();
        public int longestUnivaluePath(TreeNode root) {
            data.add(root);
            while (data.size()!=0){
                dp(data.poll(), 1);
            }
            return max;
        }
        private int dp(TreeNode treeNode,int de){
            if (treeNode.right==treeNode.left)
            {
                max=Math.max(max, de);
                return de+1;
            }
            if (treeNode.left!=null&&treeNode.left.val==treeNode.val){
                de=dp(treeNode.left, de+1);
            }
            if (treeNode.right!=null&&treeNode.right.val==treeNode.val){
                de=dp(treeNode, de+1);
            }
            return de;
        }

    }
