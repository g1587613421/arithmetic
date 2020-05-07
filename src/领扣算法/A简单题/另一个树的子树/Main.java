/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.另一个树的子树;

import java.util.LinkedList;

public class Main {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        String ts=plus(t);
        LinkedList<TreeNode> data=new LinkedList<>();
        data.addLast(s);
        while (!data.isEmpty())
        {
            TreeNode node=data.pollFirst();
            if (node.val==t.val){
                if (plus(node).equals(ts))
                    return true;
            }
            if (node.left!=null)
                data.addLast(node.left);
            if (node.right!=null)
                data.addLast(node.right);
        }
        return false;
    }
    String plus(TreeNode ro){
        if (ro==null){
            return "null";
        }
        return ro.val+plus(ro.left)+plus(ro.right);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
