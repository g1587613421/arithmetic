/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.连续数列;

public class Main {
    public int maxSubArray(int[] nums) {
        if (nums.length==1)
            return nums[0];
//        int data[]=new int[nums.length+1];
//        for (int i = 0; i < nums.length; i++) {
//            data[i+1]=data[i]+nums[i];
//        }
        int[][] ints=new int[nums.length][2];
        ints[0][0]=nums[0];
        ints[0][1]=Integer.MIN_VALUE;
        for (int i = 1; i < ints.length; i++) {
            ints[i][0]=nums[i]+Math.max(ints[i-1][0], 0);
            ints[i][1]=ints[i][0]-nums[i];
        }
        int res= Math.max(ints[ints.length-1][0],ints[ints.length-1][1]);
        for (int i = 0; i < ints.length; i++) {
            res=Math.max(res, ints[i][1]);
        }
        return res;
    }
}
