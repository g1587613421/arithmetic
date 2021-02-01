/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.数值的整数次方;

public class Main {
    public double myPow(double x, int n) {
        int flag=1;
        long nn=n;
        double res=1;
        if (x==1)
            return 1;

        if (n<0)
        {
            nn=-nn;
            x=1/x;
        }
        if (x<0)
        {
            x=-x;
            flag=n%2==0?1:-1;
        }
        double middle=1;//加速
        while (nn-->0){
            res*=x;
            if (middle==res)
                break;
            middle=res;

        }
        return res*flag;
    }
}
