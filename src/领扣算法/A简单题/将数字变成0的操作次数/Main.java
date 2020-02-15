/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.将数字变成0的操作次数;

public class Main {
    public int numberOfSteps (int num) {
        if (num==0)
            return 0;
        if (num%2==0)
            num>>=1;
        else num--;
        return 1+numberOfSteps(num);
    }
}
