/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.使数组中所有元素相等的最小操作数;

public class Main {
    public int minOperations(int n) {
        int count=0;
        for (int i = 0; i < n; i++) {
            count+=Math.abs(n-i*2-1);
        }
        return count/2;
    }
}
