/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.从中序与后序遍历序列构造二叉树;

import java.util.LinkedList;

public class Main {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        LinkedList<Integer> inor=new LinkedList<>(),post=new LinkedList<>();
        for (int i : inorder) {
            inor.addLast(i);
        }
        for (int i : postorder) {
            post.addLast(i);
        }
        return plus(inor, post);
    }
    private TreeNode plus(LinkedList<Integer> inor,LinkedList<Integer> post){
        if (inor.isEmpty())
            return null;
        TreeNode node = new TreeNode(post.peekLast());
        LinkedList<Integer> rinor=new LinkedList<>(),rpost=new LinkedList<>();
        rinor.addFirst(inor.pollLast());
        rpost.addFirst(post.pollLast());
        while (!rinor.peekFirst().equals(node.val)){
            rinor.addFirst(inor.pollLast());
            rpost.addFirst(post.pollLast());
        }
        rinor.pollFirst();
        rpost.pollLast();
        node.left=plus(inor, post);
        node.right=plus(rinor, rpost);
        return node;
    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
