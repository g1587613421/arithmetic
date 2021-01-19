/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.二进制中1的个数;

public class Main {
    public int hammingWeight(int n) {
       char[] data=Integer.toBinaryString(n).toCharArray();
       n=0;
        for (char datum : data) {
            n+=datum-'0';
        }
        return n;
    }
}
