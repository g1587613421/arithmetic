/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.和为零的N个唯一整数;

public class Main {
    public int[] sumZero(int n) {
        int middle=0;
        int res[]=new int[n];
        for (int i = 0; i <n-1 ; i++) {
            res[i]=i;
            middle+=i;
        }
        res[n-1]=-middle;
        return res;
    }
}
