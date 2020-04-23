/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法图解.从前序与中序遍历序列构造二叉树;

import java.util.LinkedList;

public class Main {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        /**
         * 转换数组为链表便于使用
         */
        LinkedList<Integer> pre=new LinkedList<>(),ino=new LinkedList<>();
        for (int i : preorder) {
            pre.addLast(i);
        }
        for (int i : inorder) {
            ino.addLast(i);
        }
        return plus(pre, ino);
    }

    private TreeNode plus(LinkedList<Integer> preorder,LinkedList<Integer> inorder){
        //如果结点数量为空表示当前子树为null
        if (preorder.size()==0)
            return null;
        //当前结点
        TreeNode root=new TreeNode(preorder.get(0));
        LinkedList<Integer> pl=new LinkedList<>();
        LinkedList<Integer> il=new LinkedList<>();
        //将要构造的左子树的对应结点找出来
        while (true){
            int i=inorder.pollFirst();
            pl.addLast(preorder.pollFirst());
            il.addLast(i);
            //如果i是中序的当前结点证明左子树的结点已经找到完了--preorder,inorder剩下的就是右子树的结点
            if (i==root.val){
                break;
            }
        }
        //剔除当前结点
        pl.pollFirst();
        il.pollLast();
        //递归寻找当前结点的两个子树
        root.left=plus(pl,il);
        root.right=plus(preorder, inorder);
        return root;
    }


//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder.length == 0){
//            return null;
//        }
//        java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
//        for(int i = 0;i < inorder.length;i++){
//            map.put(inorder[i],i);
//        }
//        return buildNode(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
//    }
//
//    public TreeNode buildNode(int[] preorder,int begin1,int end1,
//                              int[] inorder,int begin2,int end2,
//                              java.util.Map<Integer,Integer> map){
//        if(begin1 > end1 || begin2 > end2){
//            return null;
//        }
//        if(begin1 == end1){
//            return new TreeNode(preorder[begin1]);
//        }
//        TreeNode root = new TreeNode(preorder[begin1]);
//        int index = map.get(preorder[begin1]);
//        root.left = buildNode(preorder,begin1+1,begin1+index-begin2,inorder,begin2,index-1,map);
//        root.right = buildNode(preorder,begin1+1+index-begin2,end1,inorder,index+1,end2,map);
//        return root;
//    }

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
