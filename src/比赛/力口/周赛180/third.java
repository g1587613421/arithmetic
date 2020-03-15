/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛180;

import java.util.ArrayList;
import java.util.Arrays;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    ArrayList<Integer> data=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        if (root==null)
            return null;
        plus(root);
        int[] arry=new int[data.size()];
        for (int i = 0; i < arry.length; i++) {
            arry[i]=data.get(i);
        }
        Arrays.sort(arry);
        TreeNode mm=sortedArrayToBST(arry);


        return mm;
    }
    private void plus(TreeNode ro){
        if (ro!=null){
            data.add(ro.val);
            plus(ro.left);
            plus(ro.right);
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int index = nums.length / 2;
        TreeNode node = new TreeNode(nums[index]);
        int[] leftArray = new int[index];
        for(int i = 0;i<leftArray.length;i++) {
            leftArray[i] = nums[i];
        }
        node.left = sortedArrayToBST(leftArray);
        int[] rightArray = new int[nums.length - index - 1];
        for(int i = 0;i<rightArray.length;i++) {
            rightArray[i] = nums[index + 1 + i];
        }
        node.right = sortedArrayToBST(rightArray);
        return node;
    }



}