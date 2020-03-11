/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.祖父节点值为偶数的节点和;

import java.util.LinkedList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    int count=0;
    public int sumEvenGrandparent(TreeNode root) {
        LinkedList<Integer> data=new LinkedList<>();
        if (root.val%2==0)
            data.add(0);
        plus(root.left, 1, new LinkedList<>(data));
        plus(root.right, 1, data);


        return count;

    }

    private void plus(TreeNode ro,int de,LinkedList<Integer> data){
        if (ro==null)
            return;
        if (data.contains(de-2)){
            count+=ro.val;
        }
        if (ro.val%2==0)
            data.add(de);
        plus(ro.left,de+1, new LinkedList<>(data));
        plus(ro.right, de+1, data);
    }
}
