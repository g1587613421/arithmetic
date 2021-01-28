/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.在排序数组中查找数字I;

public class Main {
    public int search(int[] nums, int target) {
        if (nums.length==0)
            return 0;
        int le=0,ri=nums.length-1;
        int middle=0;
        while (le<=ri)
        {
            middle=le+(ri-le)/2;
            if (nums[middle]==target)
                break;//查找成功
            if (nums[middle]>target)
            {
                ri=middle-1;
            }
            else le=middle+1;
        }
        int count=0;
        for (int i = middle; i>=0&&nums[i]==target ; i--)
            count++;
        for (int i = middle+1; i<nums.length&&nums[i]==target ; i++)
            count++;
        return count;
    }
}
