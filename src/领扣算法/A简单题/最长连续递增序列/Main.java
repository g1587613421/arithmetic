/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最长连续递增序列;

public class Main {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length<1)
            return 0;
        int max=0,middle=1,da=nums[0];
        for (int num : nums) {
            if (da<num)
            {
                middle++;

            }
            else {
                max=Math.max(max, middle);
                middle=1;
            }
            da=num;
        }
        max=Math.max(max, middle);
        return max;
    }
}
