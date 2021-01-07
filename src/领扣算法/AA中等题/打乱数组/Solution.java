/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.打乱数组;

public class Solution {
    int data[],nums[];
        public Solution(int[] nums) {
            this.nums=nums;
            data=new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                data[i]=nums[(i+2)%nums.length];
            }
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            return data;
        }
}
