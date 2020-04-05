/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.乘积最大子数组;

public class Main {

    public int maxProduct(int[] nums) {
        int data[][]=new int[nums.length][2];
        data[0]=new int[]{nums[0],nums[0]};
        int max=data[0][0]<0?0:data[0][0];
        for (int i = 1; i < nums.length; i++) {
            data[i][0]=Math.max(nums[i],Math.max(nums[i]*data[i-1][0],nums[i]*data[i-1][1]));
            max=Math.max(max, data[i][0]);
            data[i][1]=Math.min(nums[i],Math.min(nums[i]*data[i-1][0],nums[i]*data[i-1][1]));
        }
        return max;
    }
}
