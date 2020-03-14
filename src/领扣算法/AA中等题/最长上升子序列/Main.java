/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最长上升子序列;

public class Main {

    int[] flag;
    public int lengthOfLIS(int[] nums) {
        flag=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            flag[i]=1;
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i])
                    flag[i]=Math.max(flag[i],flag[j]+1);
            }
        }
        int max=0;
        for (int i : flag) {
            max=Math.max(max, i);
        }
        return max;
    }


    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().lengthOfLIS(new int[]{8,10,9,10});
    }


}
