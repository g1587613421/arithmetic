/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int[] exchange(int[] nums) {
        Integer[] data=new Integer[nums.length];
        for (int i = 0; i < data.length; i++) {
            data[i]=nums[i];
        }
        Arrays.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2%2-o1%2;
            }
        });
        for (int i = 0; i < data.length; i++) {
            nums[i]=data[i];

        }
        return nums;
    }
}
