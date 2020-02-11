/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.使用最小花费爬楼梯;

public class Main {
    int min=Integer.MAX_VALUE;
    int stepsum[];
    public int minCostClimbingStairs(int[] cost) {
        stepsum=new int[cost.length];
       plus(cost, 0, 0);
       plus(cost, 1, 0);
        return min;
    }
    void plus(int[] cost,int step,int mon){
        if (step>cost.length-1){
            min=Math.min(min, mon);
            return;
        }
            mon+=cost[step];
        if (stepsum[step]>mon||stepsum[step]==0){
            stepsum[step]=mon;
            plus(cost, step+1, mon);
            plus(cost, step+2, mon);
        }

    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().minCostClimbingStairs(new int[]{0,0,0,1});
    }
}
