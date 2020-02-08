/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.N叉树的最大深度;

public class Main {
    int deep=0;
    public int maxDepth(Node root) {
        if (root!=null)
        plus(root, 0);
        return deep;
    }
    void plus(Node root,int dp){
        if (root.children==null||root.children.size()==0)
        {
            deep= Math.max(deep, dp+1);
            return;
        }
        for (Node child : root.children) {
            plus(child, dp+1);
        }
    }
}
