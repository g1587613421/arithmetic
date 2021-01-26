/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.数组中出现次数超过一半的数字;

import java.util.Arrays;

public class Main {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
