/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找旋转排序数组中的最小值;

public class Main {

    public int findMin(int[] nums) {
        int pre=0,last=nums.length-1;
        while (nums[pre]>nums[last]){
            int middle=(pre+last)/2;
            if (nums[middle]>=nums[pre])
            {
                pre=middle+1;
            }
            else {
                last=middle;
            }
        }
        return nums[pre];
    }
}
