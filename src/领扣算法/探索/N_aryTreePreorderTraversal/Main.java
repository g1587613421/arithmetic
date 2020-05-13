/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.N_aryTreePreorderTraversal;

import java.util.LinkedList;
import java.util.List;

public class Main {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> preorder(Node root) {
        plus(root);
        return res;
    }
    private void plus(Node node){
        if (node==null)
            return;
        res.addLast(node.val);
        for (Node child : node.children) {
            plus(child);
        }

    }




}
