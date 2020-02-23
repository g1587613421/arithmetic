/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.存在重复元素III;
//????
public class Main {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < i+1+k; j++) {
                if (Math.abs(nums[i]-nums[k])>t)
                    return false;

            }

        }


        return true;
    }
}
