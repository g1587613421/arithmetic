/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.n的第k个因子;

public class Main {
    public int kthFactor(int n, int k) {
        int num=1;
        while (num<=n&&k>0){
            if (n%num++==0){
                k--;
            }
        }
        return k==0?num-1:-1;
    }
}
