/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.N叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

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

class Main {
    ArrayList<Integer> res=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root==null)
            return new ArrayList<>();
        plus(root);
        return res;
    }
    void plus(Node ro){
        List<Node> list=ro.children;
        for (Node node : list) {
            plus(node);
        }
        res.add(ro.val);

    }

}