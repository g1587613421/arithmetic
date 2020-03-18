/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.先序遍历构造二叉树;

class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode bstFromPreorder(int[] preorder) {
            int le = 1, ri = preorder.length;
            for (int i = 0; i < preorder.length; i++) {
                if (preorder[0] <preorder[i]) {
                    ri = i;
                    break;
                }
            }

            TreeNode treeNode = new TreeNode(preorder[0]);
            treeNode.left = plus(preorder, 1, ri - 1);
            treeNode.right = plus(preorder, ri, preorder.length - 1);

            return treeNode;
        }

        TreeNode plus(int[] preorder, int start, int end) {
            System.out.println(start);
            if (start >end)
                return null;
            int ri = end+1;
            for (int i = start; i < preorder.length; i++) {
                if (preorder[start] < preorder[i]) {
                    ri = i;
                    break;
                }
            }
            TreeNode treeNode = new TreeNode(preorder[start]);
            treeNode.left = plus(preorder, start + 1, ri - 1);
            treeNode.right = plus(preorder, ri, end);

            return treeNode;
        }

    }
