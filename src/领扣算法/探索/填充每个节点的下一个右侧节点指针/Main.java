/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.填充每个节点的下一个右侧节点指针;

import java.util.LinkedList;

public class Main {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    public Node connect(Node root) {
        LinkedList<Node> data = new LinkedList<>(),middle=new LinkedList<>();
        if (root==null)
            return root;
        data.add(root);
        while (!data.isEmpty())
        {
            middle.clear();
            for (Node datum : data) {
                if (datum.left!=null)
                middle.add(datum.left);
                if (datum.right!=null)
                middle.add(datum.right);
            }
            Node mm=null;
            for (Node datum : data) {
                if (mm==null)
                {
                    mm=datum;
                }
                else {
                    mm.next=datum;
                    mm=datum;
                }
            }
            data.clear();
            data.addAll(middle);
        }
        return root;
    }
}
