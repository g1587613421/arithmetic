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

    LinkedList<TreeNode> data=new LinkedList<>();
        public int longestUnivaluePath(TreeNode root) {
            if (root==null)
                return 0;
            data.add(root);
            int res=0;
            while (!data.isEmpty())
            {
                System.out.println(data.peek().val);
                res=Math.max(res, plus(data.peekFirst().left, data.peekFirst().val)+(plus(data.peekFirst().right, data.pollFirst().val)));

            }
          return res;
        }
        private int plus(TreeNode treeNode,int target){
            if (treeNode==null||target!=treeNode.val) {
                if (treeNode!=null)
                    data.addLast(treeNode);
                return 0;
            }
            int sum=1;
            int le=plus(treeNode.left, target);
            int ri= plus(treeNode.right, target);
            if (le!=0&&ri!=0)
                data.addLast(treeNode);

           sum+=Math.max(le,ri);
           return sum;
        }


//     int max=0;
//     LinkedList<TreeNode> data=new LinkedList<>();
//        public int longestUnivaluePath(TreeNode root) {
//            data.add(root);
//            while (data.size()!=0){
//                dp(data.poll(), 1);
//            }
//            return max;
//        }
//        private int dp(TreeNode treeNode,int de){
//            if (treeNode.right==treeNode.left)
//            {
//                max=Math.max(max, de);
//                return de+1;
//            }
//            if (treeNode.left!=null&&treeNode.left.val==treeNode.val){
//                de=dp(treeNode.left, de+1);
//            }
//            if (treeNode.right!=null&&treeNode.right.val==treeNode.val){
//                de=dp(treeNode, de+1);
//            }
//            return de;
//        }

    }
