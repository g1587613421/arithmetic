/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组异或操作;

public class Main {
    public int xorOperation(int n, int start) {
        System.out.println(start);
        if (n==0)
            return start;
        else return start^xorOperation(n-1, start+2);
    }
}
