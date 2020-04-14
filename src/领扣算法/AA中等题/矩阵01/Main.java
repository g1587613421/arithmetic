/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.矩阵01;

public class Main {

    public int[][] updateMatrix(int[][] matrix) {
        int[][] data=new int[matrix.length+2][matrix[0].length+2];
        for (int i = 0; i < data.length; i++) {
            data[i][0]= Integer.MAX_VALUE;
            data[i][data[0].length-1]= Integer.MAX_VALUE;
        }
        for (int i = 0; i < data[0].length; i++) {
            data[0][i]=Integer.MAX_VALUE;
            data[data.length-1][i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                data[i+1][j+1]=matrix[i][j]==0?0:Integer.MAX_VALUE;
            }
        }
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (data[i+1][j+1]!=0) {
                        int middle=data[i+1][j+1];
                        data[i + 1][j + 1] = Math.min(data[i][j + 1], Math.min(data[i + 2][j + 1], Math.min(data[i + 1][j], data[i + 1][j + 2]))) + 1;
                        if (data[i+1][j+1]<0)
                            data[i+1][j+1]=Integer.MAX_VALUE;
                        if (middle!=data[i+1][j+1])
                            flag=true;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=data[i+1][j+1];
            }
        }
        return matrix;


    }
}
