/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.统计全为1的正方形子矩阵;

public class Main {

    public int countSquares(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if ( matrix[i][j]!=0&&matrix[i-1][j-1]!=0&&matrix[i-1][j]!=0&&matrix[i][j-1]!=0)
                matrix[i][j]=Math.min(matrix[i-1][j-1]+1,Math.min(matrix[i][j-1],matrix[i-1][j]));
            }
        }
        int count=0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                count+=anInt;
            }
        }
        return count;
    }
}
