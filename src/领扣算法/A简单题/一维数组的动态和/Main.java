/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.一维数组的动态和;

public class Main {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
