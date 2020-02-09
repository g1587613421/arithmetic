/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.岛屿数量;
//类似扫雷的算法
public class Main {
    int count=0;
    boolean flags[][];
    public int numIslands(char[][] grid) {
        if (grid.length==0)
            return 0;
        flags=new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'&&!flags[i][j])
                {
                    flags[i][j]=true;
                   count++;
                   right(i, j,grid);
                   down(i, j,grid);
                }
            }
        }
        return count;

    }
    void right(int i,int y,char[][] grid){
        i++;
        if (i<flags.length)
            if (!flags[i][y]&&grid[i][y]=='1'){
                flags[i][y]=true;
                right(i, y, grid);
                down(i, y, grid);
                up(i, y, grid);
            }
    }
    void down(int i,int y,char[][] grid){
        y++;
        if (y<flags[0].length&&!flags[i][y]&&grid[i][y]=='1'){
            flags[i][y]=true;
            right(i, y, grid);
            down(i, y, grid);
            left(i, y, grid);
        }
    }
    void left(int i,int y,char[][] grid){
        i--;
        if (i>=0)
            if (!flags[i][y]&&grid[i][y]=='1'){
                flags[i][y]=true;
//                right(i, y, grid);
                down(i, y, grid);
                up(i, y, grid);
                left(i, y, grid);
            }
    }
    void up(int i,int y,char[][] grid){
        y--;
        if (y>=0&&!flags[i][y]&&grid[i][y]=='1'){
            flags[i][y]=true;
            right(i, y, grid);
            left(i, y, grid);
            up(i, y, grid);
        }
    }


}
