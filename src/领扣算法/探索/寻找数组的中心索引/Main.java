/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找数组的中心索引;

public class Main {
    public int pivotIndex(int[] nums) {
        if (nums.length<2)
            return -1;
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        if (nums[nums.length-1]-nums[0]==0)
            return 0;
        int index=1;
        while (index<nums.length-1&&nums[index-1]!=nums[nums.length-1]-nums[index]){
            index++;
        }

        return index==nums.length-1?(nums[nums.length-2]==0?nums.length-1:-1):index;
    }
}
