/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数据流中的第K大元素;

import java.util.Arrays;

class KthLargest {
    int[] data;
    public KthLargest(int k, int[] nums) {
        data=new int[k];
        Arrays.sort(nums);
        for (int i = 0; i < data.length; i++) {
            data[i]=nums.length-1-i>=0?nums[nums.length-1-i]:Integer.MIN_VALUE;
        }
    }

    public int add(int val) {
        int midddle;
        for (int i = 0; i < data.length; i++) {
            if (val>data[i]){
                midddle=val;
                val=data[i];
                data[i]=midddle;
            }

        }
        return data[data.length-1];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */