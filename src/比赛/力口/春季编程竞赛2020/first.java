/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020;

public class first {

    public int minCount(int[] coins) {
        int sum=0;
        for (int coin : coins) {
            sum+=(coin+1)/2;
        }
        return sum;
    }
}
