/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.缺失的第一个正数;

import java.util.Arrays;

public class Main {

    public int firstMissingPositive(int[] nums) {
        if (nums.length==0)
            return 1;
        int num=0;
        int index=0;
        int max= Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        if (min>1)
            return 1;
        while (index<nums.length) {
            if (nums[index] > 0 && nums[index] <= nums.length){
                int middle=nums[index]-1;
                num=nums[middle];
                nums[middle]=min-1;
                if (num!=min-1&&middle!=index)
                nums[index]=num;
                else index++;
            }else index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=min-1)
                return i+1;

        }
        if (max>nums.length)
            return nums.length+1;
        else return max+1;
    }
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().firstMissingPositive(new int[]{4,2,1});
    }
}
