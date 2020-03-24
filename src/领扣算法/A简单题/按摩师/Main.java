/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.按摩师;

public class Main {

    public int massage(int[] nums) {
        //数据预处理
        int[] data = new int[nums.length + 1];
        if (nums.length==2)
            return Math.max(nums[0],nums[1]);
        else if (nums.length<2)
            return nums.length<1?0:nums[0];

        //贪心算法
        data[1]=nums[0];
        data[2]=nums[1];
        for (int i = 3; i <data.length ; i++) {
            data[i]=Math.max(data[i-2],data[i-3])+nums[i-1];
        }
        return Math.max(data[data.length-1],data[data.length-2]);
    }
}
