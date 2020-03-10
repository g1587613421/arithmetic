/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.删除给定值的叶子节点;

import java.util.ArrayList;

class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    class Main {
      ArrayList<TreeNode> data=new ArrayList<>();
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            boolean b=true;
            plus(root, target);
            while (b){
                b=false;
                for (TreeNode datum : data) {
                    if (datum.val!=0)
                    if ((datum.left==null||datum.left.val==0)&&(datum.right==null||datum.right.val==0)){
                        datum.val=0;
                        b=true;
                    }
                }
            }
            plus_rem(root);
            if (root.val==0)
                return null;
            return root;
        }

        void plus_rem(TreeNode ro){
            if (ro==null)
                return;
            if (ro.left!=null&&ro.left.val==0)
                ro.left=null;
            else plus_rem(ro.left);
            if (ro.right!=null&&ro.right.val==0)
                ro.right=null;
            else plus_rem(ro.right);

        }
        void plus(TreeNode ro,int target){
            if (ro.val==target)
                data.add(ro);
            if (ro.left!=null)
                plus(ro.left, target);
            if (ro.right!=null)
                plus(ro.right, target);
        }

}
