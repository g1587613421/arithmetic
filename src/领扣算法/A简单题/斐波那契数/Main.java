/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.斐波那契数;

public class Main {
//暴力
    public int fib(int N) {
        if (N<2)
            return N-1;
        return fib(N-1)+fib(N-2);
    }
}
