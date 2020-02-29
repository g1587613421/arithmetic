/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最小移动次数使数组元素相等;

public class Main {
    public int minMoves(int[] nums) {
        if (nums.length<=1)
            return 0;
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            max=Math.max(max, num);
        }
        int sum=0;
        for (int num : nums) {
            sum+=max-num;
        }
        while (sum%(nums.length-1)!=0){
            sum+=nums.length;
        }
        return sum/(nums.length-1);
    }

}
