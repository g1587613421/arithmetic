/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.统计优美子数组;

public class Main {
    public int numberOfSubarrays(int[] nums, int k) {
       int[] data=new int[nums.length];
       int count=0;
       data[0]=1;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i]%2;
            data[count]++;
        }
        count=0;
        for (int i = 0; i < data.length-k; i++) {
            count+=data[i]*data[i+k];
        }
        return count;
    }
}
