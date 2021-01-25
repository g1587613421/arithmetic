/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.打印从1到最大的n位数;

public class Main {
    public int[] printNumbers(int n) {
        int size=1;
        while (n-->0){
            size*=10;
        }
        int res[] =new int[size];
        for (int i = 0; i < size; i++) {
            res[i]=i;
        }
        return res;
    }
}
