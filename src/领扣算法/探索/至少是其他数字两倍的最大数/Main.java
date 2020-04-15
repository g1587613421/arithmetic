/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.至少是其他数字两倍的最大数;

public class Main {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                sec=max;
                max=nums[i];
                index=i;
            }
            else if (nums[i]>sec){
                sec=nums[i];
            }
        }

        return max>=sec*2?index:-1;
    }
}
