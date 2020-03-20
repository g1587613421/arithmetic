/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的坡度;

public class Main {
    boolean f=true;
    public int findTilt(TreeNode root) {
        if (f)
            plus(root);
        f=false;
        if (root==null)
            return 0;

        return Math.abs((root.right==null?0:root.right.val)-(root.left==null?0:root.left.val))+findTilt(root.left)+findTilt(root.right);
    }

        int plus(TreeNode ro){
        if (ro==null)
            return 0;
        ro.val+=plus(ro.left)+plus(ro.right);
        return ro.val;
    }

    //写成了最大坡度了

//    public int findTilt(TreeNode root) {
//        //构造前缀二叉树
//        root.val=plus(root);
//
//        //寻找最大结点的值
//        return find(root);
//    }
//
//    int find(TreeNode ro){
//        return ro==null?0:Math.max(Math.abs((ro.left==null?0:ro.left.val)-(ro.right==null?0:ro.right.val)), Math.max(find(ro.left), find(ro.right)));
//    }
//    int plus(TreeNode ro){
//        if (ro==null)
//            return 0;
//        return ro.val+plus(ro.left)+plus(ro.right);
//    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
