/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.打家劫舍II;

import java.util.Arrays;

public class Main {

    public int rob(int[] nums) {
        if (nums.length<1)
            return 0;
        if (nums.length==1)
            return nums[0];
        if (nums.length==2)
            return Math.max(nums[0],nums[1]);
        if (nums.length==3)
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        int max=0;
        int data[][]=new int[nums.length][2];
        data[0]=new int[]{nums[0],0};
        data[2]=new int[]{nums[0]+nums[2],nums[0]};
        for (int i = 3; i < nums.length-1; i++) {
            data[i]=new int[]{Math.max(data[i-1][1]+nums[i],data[i-2][1]+nums[i]),Math.max(data[i-1][0],data[i-1][1])};
        }
        max=Math.max(data[nums.length-2][0],data[nums.length-2][1]);

        Arrays.fill(data, new int[2]);
        data[1]=new int[]{nums[1],0};
        for (int i = 2; i < nums.length; i++) {
            data[i]=new int[]{Math.max(data[i-1][1]+nums[i],data[i-2][1]+nums[i]),Math.max(data[i-1][0],data[i-1][1])};
        }
        max=Math.max(max, Math.max(data[nums.length-1][0],data[nums.length-1][1]));
        return max;
    }
}
