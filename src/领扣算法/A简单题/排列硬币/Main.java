/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.排列硬币;

public class Main {
//等差数列

    public int arrangeCoins(int n) {
        int i=0;
        while (n>=0){
            n-=(i++);
        }
        return i-1;
    }
}
