/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.存在重复元素III;

public class Main {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length-k; i++) {
            int pre=nums[i];
            for (int j = i; j < i+k; j++) {
                if (Math.abs(nums[j]-i)<=t){
                    return true;
                }
            }

        }
        return false;
    }
}
