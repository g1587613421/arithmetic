/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.子数组和排序后的区间和;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    LinkedList<Integer> middle=new LinkedList<>();
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] data=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            data[i+1]=data[i]+nums[i];
            middle.addLast(nums[i]);
        }
        int sp=2;
        while (sp<=nums.length){
           int pre=0;
           while (pre+sp<data.length){
               middle.addLast(data[pre+sp]-data[pre]);
               pre++;
           }
            sp++;
        }
        Collections.sort(middle);
        long res=0L;
        for (int i = 0; i < left-1; i++) {
            middle.pollFirst();
        }
        for (int i = 0; i < right-left+1; i++) {
            res+=middle.pollFirst();
        }
        return (int)(res%1000000007);

    }
}
