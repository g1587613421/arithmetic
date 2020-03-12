/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.多数元素;

import java.util.Arrays;

public class Main {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);


        return nums[nums.length/2];
    }
}
