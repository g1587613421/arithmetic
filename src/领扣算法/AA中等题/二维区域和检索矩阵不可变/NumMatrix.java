/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.二维区域和检索矩阵不可变;


class NumMatrix {
    int[][] data;
    public NumMatrix(int[][] matrix) {
        if (matrix.length==0)
        {
            data=new int[1][1];
            return;
        }
        data=new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                data[i+1][j+1]=data[i+1][j]+data[i][j+1]-data[i][j]+matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (data.length<2||data[0].length<2)
            return 0;
        return data[row2+1][col2+1]-data[row2+1][col1]-data[row1][col2+1]+data[row1][col1];
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new NumMatrix(new int[0][0]);
    }
}
