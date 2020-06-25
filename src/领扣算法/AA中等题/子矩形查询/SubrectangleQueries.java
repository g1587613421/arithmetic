/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.子矩形查询;

public class SubrectangleQueries {
    int[][] data;
    public SubrectangleQueries(int[][] rectangle) {
        data=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <=row2; i++) {
            for (int j = col1; j <= col2; j++) {
                data[i][j]=newValue;

            }
        }
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }
}
