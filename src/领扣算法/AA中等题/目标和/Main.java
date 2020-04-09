/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.目标和;

public class Main {

    public int findTargetSumWays(int[] nums, int S) {
        int data[][]=new int[nums.length][2001];
        data[0][1000+nums[0]]=1;
        data[0][1000-nums[0]]+=1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i-1][j]!=0){
                    data[i][j+nums[i]]+=data[i-1][j];
                    data[i][j-nums[i]]+=data[i-1][j];
                }

            }
        }
        return S>1000?0:data[data.length-1][S+1000];
    }

//暴力求解
//    int count=0;
//    public int findTargetSumWays(int[] nums, int S) {
//        plus(nums, S, 0);
//        return count;
//    }
//    void plus(int[] nums,int target,int index){
//        if (index==nums.length)
//        {
//            count+=target==0?1:0;
//            return;
//        }
//        plus(nums, target-nums[index],index+1);
//        plus(nums, target+nums[index],index+1);
//    }
}
