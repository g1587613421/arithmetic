/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.岛屿的周长;

public class Main {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    if (i<1||grid[i-1][j]==0)
                        count++;
                    if (j<1||grid[i][j-1]==0)
                        count++;
                    if (i>=grid.length-1||grid[i+1][j]==1)
                        count++;
                    if (j>=grid[0].length-1||grid[i][j+1]==1)
                        count++;
                }

            }

        }
        return count;
    }
}
