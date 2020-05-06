/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找重复的子树;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    HashSet<String> data=new HashSet<>(),fliter=new HashSet<>();
    HashSet<TreeNode> result=new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
       String s = printTree(root);
       data.add(s);
       return new LinkedList<>(result);
    }
    private String printTree(TreeNode treeNode){
        if (treeNode==null)
            return null;
        String s = treeNode.val+printTree(treeNode.left)+printTree(treeNode.right);
        if (data.contains(s)&&!fliter.contains(s))
        {
            result.add(treeNode);
            fliter.add(s);
        }
        else {
            data.add(s);
        }
        return s;
    }


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
