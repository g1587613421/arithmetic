/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.斐波那契数列;

public class Main {
    long num1=0,num2=1,middle=0;
    public int fib(int n) {
        if (n<1)
            return 0;
        while (n-->1){
            middle=num1+num2;
            middle%=1000000007;
            num1=num2;
            num2=middle;
        }
        return (int) (num2%1000000007);
    }
}
