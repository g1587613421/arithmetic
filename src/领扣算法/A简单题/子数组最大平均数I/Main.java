/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.子数组最大平均数I;

public class Main {

    public double findMaxAverage(int[] nums, int k) {
        int[] data = new int[nums.length + 1];
        for (int i = 1; i < data.length; i++) {
            data[i]=data[i-1]+nums[i-1];
        }
        int middle=Integer.MIN_VALUE;
        for (int i = k; i <data.length ; i++) {
            middle=Math.max(middle, data[i]-data[i-k]);
        }
        return (double) middle/k;
    }
}
