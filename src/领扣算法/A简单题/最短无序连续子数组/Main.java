/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最短无序连续子数组;

import java.util.Arrays;

public class Main {

    public int findUnsortedSubarray(int[] nums) {
        int[] middle= Arrays.stream(nums).toArray();
        Arrays.sort(middle);
        int previous=-1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=middle[i]) {
                previous = i;
                break;
            }
        }
        if (previous==-1)
            return 0;
        int end=nums.length-1;
        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i]!=middle[i])
            {
                end=i;
                break;
            }
        }
        return end-previous+1;
    }
}
