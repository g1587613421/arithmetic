/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.斐波那契数;

public class Main {
    int fir=0,sec=1,middle;
    public int fib(int N) {
        if (N<2)
            return N;
        for (int i = 0; i < N; i++) {
            middle=sec;
            sec+=fir;
            fir=middle;
        }
        return sec;
    }

////暴力
//    public int fib(int N) {
//        if (N<2)
//            return N-1;
//        return fib(N-1)+fib(N-2);
//    }
}
