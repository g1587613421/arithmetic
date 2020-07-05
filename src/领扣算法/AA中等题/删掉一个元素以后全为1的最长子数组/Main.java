/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.删掉一个元素以后全为1的最长子数组;

import java.util.LinkedList;

public class Main {
    public int longestSubarray(int[] nums) {
        LinkedList<Integer> data=new LinkedList<>();
        int count=0;
        for (int num : nums) {
            if (num==0)
            {
                data.addLast(count);
                count=0;
            }
            else count++;
        }
        data.addLast(count);
        count=0;
        int max=0;
        for (Integer datum : data) {
            max=Math.max(max, datum+count);
            count=datum;
        }
        return max==nums.length?nums.length-1:max;


    }
}
