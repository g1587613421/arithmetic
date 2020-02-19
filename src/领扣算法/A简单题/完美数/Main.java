/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.完美数;

public class Main {

    public boolean checkPerfectNumber(int num) {
        int middle=1;
        for (int i = 2; i <Math.pow(num, 0.5); i++) {
            if (num%i==0)
                middle=middle+i+num/i;
        }

        return num>1&&middle==num;
    }
}
