/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.岛屿的最大面积;

public class Main {
    int max=0,count=0;
    public int maxAreaOfIsland(int[][] grid) {
        //并查集
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1) {
                    grid[i][j]=0;
                    count = 1;
                    plus_D(grid,i, j);
                    plus_R(grid,i, j);
                }
                max=Math.max(max, count);
            }

        }


        return max;
    }

    void plus_U(int[][] grid,int x,int y){
        if (--y<0)
            return;
        if (grid[x][y]==1){
            count++;
            grid[x][y]=0;
            plus_U(grid, x, y);
            plus_L(grid, x, y);
            plus_R(grid, x, y);
        }
    }
    void plus_D(int[][] grid,int x,int y){
        if (++y>grid[0].length-1)
            return;
        if (grid[x][y]==1){
            count++;
            grid[x][y]=0;
            plus_D(grid, x, y);
            plus_L(grid, x, y);
            plus_R(grid, x, y);
        }
    }
    void plus_R(int[][] grid,int x,int y){
        if (++x>grid.length-1)
            return;
        if (grid[x][y]==1){
            count++;
            grid[x][y]=0;
            plus_U(grid, x, y);
            plus_D(grid, x, y);
            plus_R(grid, x, y);
        }
    }
    void plus_L(int[][] grid,int x,int y){
        if (--x<0)
            return;
        if (grid[x][y]==1){
            count++;
            grid[x][y]=0;
            plus_L(grid, x, y);
            plus_D(grid, x, y);
            plus_U(grid, x, y);
        }
    }

}
