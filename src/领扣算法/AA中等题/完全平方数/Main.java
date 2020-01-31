/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.完全平方数;

import Tools.SimpleTimeTest;

public class Main {
    int min=Integer.MAX_VALUE;
    public int numSquares(int n) {
        if (n==0)
            return 0;
        for (int i = (n+1)/2; i >0; i--) {
            if (n>=i*i)
                plus(n-i*i,i*i, 1);
        }
        return min==Integer.MAX_VALUE?1:min;
    }

    void plus(int target,int flag,int step){
        if (step>=min)
            return;
        if (target==0)
        {
            min=Math.min(min, step);
            return;
        }
        for (int i = flag; i>0; i--) {
            if (target>=i*i)
                plus(target-i*i,i*i, step+1);
            else break;
        }
    }

    public static void main(String arg[]){//main--来自高金磊
        Main main=new Main();
        SimpleTimeTest.TestMethod();
        System.out.println( main.numSquares(7168));

        SimpleTimeTest.endMethod("");
    }
}
