/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.剪绳子II;

public class Main {

    public int cuttingRope(int n) {
        if (n<=3)
            return n-1;
        long res=1;
        int middle=n/3;
        while (middle-->1)
        {
            res*=3;
            res%=1000000007;
        }
        n%=3;
        res=Math.max(res*(3+n),res*3*n)%1000000007;
        return (int) res;
    }
}
