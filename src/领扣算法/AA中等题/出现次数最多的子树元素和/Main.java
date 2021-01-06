/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.出现次数最多的子树元素和;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    HashMap<Integer,Integer> data=new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
       plus(root);
       int max=0;
        for (Integer value : data.values()) {
            max=Math.max(max, value);
        }
        LinkedList <Integer> res=new LinkedList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : data.entrySet()) {
            if (integerIntegerEntry.getValue()==max)
                res.addFirst(integerIntegerEntry.getKey());
        }
        int[] result=new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=res.pollFirst();
        }
        return result;
    }

    private int plus(TreeNode root) {
        if (root==null)
            return 0;
        int middle=root.val+plus(root.left)+plus(root.right);
        data.put(middle, data.getOrDefault(middle, 0)+1);
        return middle;
    }


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
