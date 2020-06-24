/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最接近的三数之和;

import java.util.Arrays;

public class Main {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right=nums.length-1;
        int Max=Integer.MAX_VALUE;
        int targetMiddle;
        int value=0;
        for (int i = 0; i < nums.length-2; i++) {
            targetMiddle=target-nums[i];
            left=i+1;
            right=nums.length-1;
            int middlesize=Integer.MAX_VALUE;
            int middlevalue=0;
            while (left<right){
                int middle= targetMiddle-nums[left]- nums[right];
                middlesize=Math.min(middlesize, Math.abs(middle));
                if (middlesize==Math.abs(middle))
                    middlevalue=target-middle;
                if (middle>0)
                    left++;
                else right--;
            }
           Max= Math.min(Max, middlesize);
            if (Max==middlesize)
                value=middlevalue;
            if (Max==0)
                return value;
        }
        return value;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().threeSumClosest(new int[]{-4,-1,2,1}, 1);
    }
}
