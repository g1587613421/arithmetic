/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.最大升序子数组和;

public class Main {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int count=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max, count);
            if (nums[i]>nums[i-1])
                count+=nums[i];
            else count=nums[i];

        }
        return Math.max(max, count);
    }
}
