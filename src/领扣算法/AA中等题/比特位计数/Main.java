/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.比特位计数;

public class Main {
    int res[];
    int max;
    public int[] countBits(int num) {
        res=new int[num+1];
        max=num;
        res[0]=0;
        if (num==0)
            return res;
        res[1]=1;
        plus(res[1],1);
        return res;
    }
    void plus(int num,int sum){
        num<<=1;
        if (num<=max) {
            res[num] = sum;
            plus(num, sum);
        }
        num++;
        if (num<=max){
            res[num]=sum+1;
            plus(num, sum+1);
        }
    }
}
