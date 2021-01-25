/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.青蛙跳台阶问题;

public class Main {
    long num1=1,num2=2,middle=0;
    public int numWays(int n) {
        if (n<2)
            return 1;
        while (n-->2){
            middle=num1+num2;
            middle%=1000000007;
            num1=num2;
            num2=middle;
        }
        return (int) (num2%1000000007);
    }
}
