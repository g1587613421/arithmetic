/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.机器人的运动范围;

public class Main {

    public int movingCount(int m, int n, int k) {
        boolean data[][]=new boolean[m+1][n+1];
        data[0][1]=true;
        int count=0;
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (plus(i-1, j-1,k)&&(data[i-1][j]||data[i][j-1])){
                    data[i][j]=true;
                    count++;
                }
            }

        }
        return count;
    }
    boolean plus(int num1,int num2,int k){
        int middle=0;
        while (num1!=0){
            middle+=num1%10;
            num1/=10;
        }
        while (num2!=0){
            middle+=num2%10;
            num2/=10;
        }

        return middle<=k;
    }
}
