/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.斐波拉契数列;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        //50位斐波那契
        //DP
        long[] data=new long[50];
        data[1]=1;
        for (int i = 2; i < data.length; i++) {
            data[i]=data[i-1]+data[i-2];
            System.out.printf("第%d位是%d\n",i,data[i]);
        }
    }
}
