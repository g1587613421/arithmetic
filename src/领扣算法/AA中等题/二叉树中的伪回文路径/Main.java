/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二叉树中的伪回文路径;


import java.util.HashSet;

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
     int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        HashSet<Integer> middle=new HashSet<>();
        //遍历树
        plus(root,middle);
        return count;
    }
    private void plus(TreeNode treeNode,HashSet<Integer> data){
        if (treeNode==null)
            return;

        if (data.contains(treeNode.val))
         data.remove(treeNode.val);
        else {
            data.add(treeNode.val);
        }
        if (treeNode.left==treeNode.right){
            if (data.size()<=1)
                count++;
            return;
        }
        HashSet<Integer> middle=new HashSet<>();
        middle.addAll(data);
        plus(treeNode.left,data);
        plus(treeNode.right,middle);
    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        HashSet<Integer> data=new HashSet<>();
        int a=1,b=1;
        data.add(a);
        data.add(b);
        System.out.println(data.size());
        if (data.contains(a))
        data.remove(a);
        System.out.println(data.size());
        
    }
}
