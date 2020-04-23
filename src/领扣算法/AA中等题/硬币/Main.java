/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.硬币;

import Tools.SimpleTimeTest;

public class Main {

    public int waysToChange(int n) {
        n/=5;
        int A=n/5,B=0,C=0;
        int count=0;
        for (int i = 0; i <= A; i++) {
            int last=n-i*5;
            last/=2;
            last+=1;
            count+=last*last;
            count%=1000000007;
        }
        return count;
    }
    
    
    public static void main(String arg[]){//main--来自高金磊
        SimpleTimeTest.TestMethod();

        SimpleTimeTest.endMethod(""+new Main().waysToChange(15));
    }
}
