/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.验证二叉搜索树;

import java.util.ArrayList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
     ArrayList<Integer> result=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        plus(root);
        if (result.size()<2)
            return true;
        int mm=result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (mm>=result.get(i))
                return false;
            mm=result.get(i);
        }
        return true;
    }
    void plus(TreeNode ro){
        if (ro==null)
            return;
        plus(ro.left);
        result.add(ro.val);
        plus(ro.right);

    }
}