/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.把二叉搜索树转换为累加树;

import java.util.LinkedList;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {

    LinkedList<Integer> data;
    public TreeNode bstToGst(TreeNode root) {
        if (root==null)
            return root;
        data = new LinkedList<>();
        sequentialTraversal(root);
        data.addFirst(data.pollLast());
        for (int i = 1; i < data.size(); i++) {
            data.addFirst(data.peekFirst()+data.pollLast());
        }
        //还原
        reduction(root);
        return root;
    }
    void sequentialTraversal(TreeNode root){
        if (root==null)
            return;
        sequentialTraversal(root.left);
        data.add(root.val);
        sequentialTraversal(root.right);
    }
    void reduction(TreeNode root){
        if (root==null)
            return;
        reduction(root.left);
        root.val=data.pollFirst();
        reduction(root.right);
    }
}
