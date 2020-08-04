/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.好叶子节点对的数量;

import java.util.LinkedList;
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

   public class Main {
       int res=0;
       public int countPairs(TreeNode root, int distance) {
           //统计左右子树的叶子情况
           int[] le;

           int[] ri;

           LinkedList<TreeNode> data=new LinkedList<>();
           data.addLast(root);
           while (!data.isEmpty())
           {
               TreeNode treeNode=data.pollFirst();
               if (treeNode.left!=null)
                   data.addLast(treeNode.left);
               if (treeNode.right!=null)
                   data.addLast(treeNode.right);
               //计算相对深度
               le = new int[distance+1];
               plus(treeNode.left, 1, le);
               ri = new int[distance+1];
               plus(treeNode.right, 1, ri);
               //处理数据
               for (int i = 1; i < le.length; i++) {
                   if (le[i]==0)
                       continue;
                   for (int j = 1; j <=distance-i; j++) {
                       res+=le[i]*ri[j];
                   }

               }
           }
           return res;

       }

       //叶子结点深度计算
       private void plus(TreeNode root,int depth,int[] data){
           if (root==null)
               return;
           if (depth>data.length-1)
               return;//超标
           if (root.left==root.right){
               data[depth]++;
               return;
           }
           plus(root.left, depth+1, data);
           plus(root.right, depth+1, data);
       }


       public static void main(String arg[]){//main--来自高金磊
           TreeNode root=new TreeNode(1);
           root.left=new TreeNode(2);
           root.left.right=new TreeNode(3);
           root.right=new TreeNode(4);
           new Main().countPairs(root, 3);
       }
    }

