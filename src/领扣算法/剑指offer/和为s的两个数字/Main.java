/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.和为s的两个数字;

import java.util.HashSet;

public class Main {

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> data=new HashSet<>();
        for (Integer datum : nums) {
            if (data.contains(target-datum))
            {
                return new int[]{target-datum,datum};
            }
            data.add(datum);
        }
        return new int[2];
    }
}
