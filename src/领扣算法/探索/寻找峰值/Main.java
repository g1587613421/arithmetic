/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找峰值;

public class Main {

    public int findPeakElement(int[] nums) {
        if (nums.length<=1){
            return 0;
        }
        if (nums[0]>nums[1]){
            return 0;
        }
        if (nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        int index=nums.length/2;
        int pre=0,last=nums.length-1;
        while (last-pre>1){
            if (nums[index]>nums[index-1]&&nums[index]>nums[index+1]){
                return index;
            }
            else {
                if (nums[index]<nums[index-1]){
                    last=index;
                    index-=(index-pre)/2;
                }
                else {
                    pre=index;
                    index+=(last-pre)/2;
                }
            }
        }
        if (pre==0)
            return 0;
        if (last==nums.length-1)
            return last;
        if (nums[pre]>nums[pre+1]&&nums[pre]>nums[pre-1]){
            return pre;
        }
        else return last;

    }
}
