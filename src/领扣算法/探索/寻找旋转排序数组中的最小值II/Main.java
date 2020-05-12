/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找旋转排序数组中的最小值II;

public class Main {

    public int findMin(int[] nums) {
        int pre=0,last=nums.length-1;
        if (nums[pre]<nums[last])
            return nums[pre];
        while (pre<last){
            int middle=pre+(last-pre)/2;
            if (nums[middle]==nums[last]){
                last--;
                continue;
            }
            if (nums[middle]>nums[last])
            {
                pre=middle+1;
            }
            else {
                last=middle;
            }
        }

        return nums[last];
    }
}
