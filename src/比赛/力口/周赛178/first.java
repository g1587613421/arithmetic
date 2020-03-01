/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛178;

public class first {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[]=new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            int count=0;
            for (int num : nums) {
                if (num<nums[i])
                    count++;
            }
            result[i]=count;

        }
        return result;
    }
}
