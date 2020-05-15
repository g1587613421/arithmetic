/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.和为K的子数组;

public class Main {

    public int subarraySum(int[] nums, int k) {
        int data[]=new int[nums.length+1];
        for (int i = 1; i < data.length; i++) {
            data[i]=data[i-1]+nums[i-1];
        }
        int count=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
             count+=data[j]-data[i]==k?1:0;
            }
        }
        return count;
    }
}
