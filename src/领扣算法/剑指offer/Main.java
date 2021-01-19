/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer;

import java.util.HashSet;

public class Main {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> data=new HashSet<>();
        for (int num : nums) {
            if (data.contains(num))
                return num;
            data.add(num);
        }
        return -1;
    }
}
