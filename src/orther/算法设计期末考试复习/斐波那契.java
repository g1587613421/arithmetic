/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

import Tools.SimpleTimeTest;

public class 斐波那契 {

    private int fbnq(int num){
        if (num<2){
            return 1;
        }
        return fbnq(num-1)+fbnq(num-2);
    }
    int[] data;
    private int fbnq_DP(int num){
        if (num<2)
            return 1;
        data=new int[num];
        data[0]=1;
        data[1]=1;
        for (int i = 2; i < data.length; i++) {
            data[i]=data[i-1]+data[i-2];
        }
        return data[data.length-1];
    }

    public static void main(String arg[]){//main--来自高金磊

        斐波那契 fb = new 斐波那契();
        SimpleTimeTest.TestMethod();
        fb.fbnq_DP(9000);
        SimpleTimeTest.endMethod("DP的使用时间");
        SimpleTimeTest.TestMethod();
        fb.fbnq(30);
        SimpleTimeTest.endMethod("非DP的使用时间");


    }

}
