/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.非递减数列;

public class Main {
    public boolean checkPossibility(int[] nums) {
        int data[]=new int[nums.length];
        for (int i = 0; i < data.length; i++) {
            data[i]=nums[i];
        }
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<nums[i-1]){
                nums[i]=nums[i-1];
                count++;
                if (count>1){
                  break;
                }
            }
        }
        if (count<=1)
            return true;
        count=0;
        for (int i = data.length-1; i >0; i--) {
            if (data [i]<data[i-1]){
                data[i-1]=data[i];
                count++;
                if (count>1){
                    return false;
                }
            }

        }
        return true;
    }
}
