/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组拆分I;

import java.util.Arrays;

public class Main {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i+=2) {
            nums[0]+=nums[i];
        }
        return nums[0];
    }
}
