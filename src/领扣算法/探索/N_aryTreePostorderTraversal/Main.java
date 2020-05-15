/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.N_aryTreePostorderTraversal;

import java.util.LinkedList;
import java.util.List;

public class Main {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

        LinkedList<Integer> res=new LinkedList<>();
        public List<Integer> postorder(Node root) {
            plus(root);
            return res;
        }
        private void plus(Node node){
            if (node==null)
                return;
            for (Node child : node.children) {
                plus(child);
            }
            res.addLast(node.val);
        }
}
