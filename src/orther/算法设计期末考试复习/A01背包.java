/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

import java.util.Arrays;

public class A01背包 {
    int[] ws=new int[]{2,3,5,5};
    int[] vs=new int[]{2,4,3,7};
    private int solute(int bagsize){//背包大小
        int data[][]=new int[ws.length+1][bagsize+1];
        for (int i = 0; i < vs.length; i++) {
            for (int j = 0; j < Math.min(bagsize, ws[i]); j++) {
                data[i+1][j]=data[i][j];
            }
            for (int j = ws[i]; j <bagsize+1 ; j++) {
                data[i+1][j]=Math.max(data[i][j-ws[i]]+vs[i],data[i][j]);
            }
        }
        return Arrays.stream(data[data.length-1]).max().getAsInt();

    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new A01背包().solute(10));
    }
}
