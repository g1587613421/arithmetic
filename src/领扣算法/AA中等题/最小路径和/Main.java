/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最小路径和;

public class Main {

    public int minPathSum(int[][] grid) {
        int[][] data = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 0; i < grid.length; i++) {
            data[i+1][1]=data[i][1]+grid[i][0];
        }
        for (int i = 0; i < grid[0].length; i++) {
            data[1][i+1]=data[1][i]+grid[0][i];
        }
        for (int i = 2; i <data.length ; i++) {

            for (int j = 2; j <data[0].length ; j++) {
                data[i][j]=Math.min(data[i-1][j],data[i][j-1])+grid[i-1][j-1];
            }

        }
        return data[data.length-1][data[0].length-1];
    }
}
