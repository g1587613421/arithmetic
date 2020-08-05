/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.三次操作后最大值与最小值的最小差;

import java.util.Arrays;

public class Main {

    public int minDifference(int[] nums) {
        if (nums.length<=3)
            return 0;
        Arrays.sort(nums);
        return Math.min(nums[nums.length-4]-nums[0],Math.min(nums[nums.length-3]-nums[1],Math.min(nums[nums.length-2]-nums[2],nums[nums.length-1]-nums[3])));
    }
}
