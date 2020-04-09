/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二分查找;

public class Main {

    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left!=right&&target<=nums[right]&&target>=nums[left]){
            int middle=(left+right)/2;
            if (nums[middle]==target)
                return middle;
            if (nums[middle]<target){
                left=middle+1;
            }
            else {
                right=middle-1;
            }
        }
        return nums[left]==target?left:-1;
    }
}
