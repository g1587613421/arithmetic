/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉搜索树的最近公共祖先;

import java.util.LinkedList;

public class Main {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int ip=p.val,iq=q.val;
        if (ip>iq)
        {
            int middle=ip;
            ip=iq;
            iq=middle;
        }
        TreeNode res=null;
        LinkedList<TreeNode> data=new LinkedList<>();
        data.add(root);
        while (!data.isEmpty()){
                if (plus(data.peek(), ip)&&plus(data.peek(), iq)){
                    res=data.pollFirst();
                    if (res.left!=null){
                        data.addLast(res.left);
                    }
                    if (res.right!=null){
                        data.addLast(res.right);
                    }
                }
                else data.pollFirst();
        }
        return res;
    }
    //搜索值
    private boolean plus(TreeNode ro,int target){
        if (ro==null)
            return false;
        if (ro.val==target)
            return true;
        if (target>ro.val)
            return plus(ro.right, target);
        else return plus(ro.left, target);
    }
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
