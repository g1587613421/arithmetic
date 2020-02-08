/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.N叉树的最大深度;

import java.util.List;

public class Node {
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
