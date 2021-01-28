/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.二叉搜索树的第k大节点;

import 领扣算法.剑指offer.TreeNode;

import java.util.LinkedList;

public class Main {
    LinkedList<Integer> data=new LinkedList<>();
    int size=0;
    public int kthLargest(TreeNode root, int k) {
        size=k;
        plus(root);
        return data.pollLast();
    }
    //中根遍历
    void plus(TreeNode ro){
        if (ro==null||size<=0)
            return;
        plus(ro.right);

        if (size-->0){
            data.addLast(ro.val);
            plus(ro.left);
        }

    }
}
