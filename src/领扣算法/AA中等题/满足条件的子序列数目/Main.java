/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.满足条件的子序列数目;

import java.util.Arrays;

public class Main {
    long data_middle[];
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        data_middle=new long[nums.length];
        init(data_middle);
        long count=0L;
        int right=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]*2>target)
                break;
            for (int j = right;j>=i;j--) {
                if (nums[i]+nums[j]<=target){
                    count+=data_middle[j-i];
                    count%=1000000007;
                    right=j;
//                    count+=Math.pow(2, j-i);//java pow 返回的是double 很有可能发生截断
                    break;
                }

            }

        }
        return (int) (count%1000000007);
    }

    private void init(long[] data_middle) {
        data_middle[0]=1;
        for (int i = 1; i < data_middle.length; i++) {
            data_middle[i]=(data_middle[i-1]*2)%1000000007;
        }
    }
}
