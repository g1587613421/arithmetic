/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二叉树的层平均值;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> middle=new LinkedList<>();
        LinkedList<TreeNode> data=new LinkedList<>();
        LinkedList<Double> res=new LinkedList<>();
        int count=1;
        double sum=0d;
        data.addFirst(root);
        while (!data.isEmpty()||!middle.isEmpty())
        {
            if (data.isEmpty()){
                res.addLast(sum/count);
                count=middle.size();
                sum=0d;
                data.addAll(middle);
                middle.clear();
            }
            TreeNode mm=data.pollFirst();
            sum+=(mm.val);
            if (mm.left!=null)
            middle.add(mm.left);
            if (mm.right!=null)
            middle.add(mm.right);
        }
        res.addLast(sum/count);
        return res;
    }
}


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
