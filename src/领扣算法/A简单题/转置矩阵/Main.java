/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.转置矩阵;

public class Main {
    public int[][] transpose(int[][] matrix) {
        int[][] data=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                data[j][i]=matrix[i][j];
            }
        }
        return data;
    }
}
