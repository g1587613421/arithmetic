/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.重新排列数组;

public class Main {

    public int[] shuffle(int[] nums, int n) {
        int data[]=new int[nums.length];
        //归并排序
        for (int i = 0; i < nums.length/2; i++) {
            data[2*i]=nums[i];
            data[2*i+1]=nums[i+nums.length/2];
        }
        return data;
    }
}
