/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.下一个更大元素I;

import java.util.HashMap;

public class Main {

    HashMap<Integer,Integer> data=new HashMap<>();
    int result[];
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        result=new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            data.put(nums2[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i]=plus(nums2, data.get(nums1[i]),nums1[i]);
        }

        return result;
    }
    int plus(int[] nums,int start,int target){
        for (int i = start ; i <nums.length; i++) {
            if (target<nums[i])
                return nums[i];
        }

        return -1;
    }
}
