/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.在区间范围内统计奇数数目;

public class Main {

    public int countOdds(int low, int high) {
        if (low==high)
            return low%2;
        return (high-low-1)/2+(low%2+high%2)==0?1:(low%2+high%2);
    }
}
