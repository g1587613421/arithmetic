/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.腐烂的橘子;

public class Main {
    public int orangesRotting(int[][] grid) {
        int times = 1;
        boolean flag = true;
        int[][] note = new int[grid.length][grid[0].length];
        for(int i=0; i<note.length; i++){
            for(int j=0; j<note[0].length; j++){
                if(grid[i][j]==2){
                    note[i][j] = times;
                }else{
                    note[i][j] = 0;
                }
            }
        }
        while(flag){
            flag = false;
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]==2&&note[i][j]==times){
                        if(i>0&&grid[i-1][j]==1){
                            grid[i-1][j] = 2;
                            note[i-1][j] = times+1;
                            flag = true;
                        }
                        if(i<grid.length-1&&grid[i+1][j]==1){
                            grid[i+1][j] = 2;
                            note[i+1][j] = times+1;
                            flag = true;
                        }
                        if(j>0&&grid[i][j-1]==1){
                            grid[i][j-1] = 2;
                            note[i][j-1] = times+1;
                            flag = true;
                        }
                        if(j<grid[i].length-1&&grid[i][j+1]==1){
                            grid[i][j+1] = 2;
                            note[i][j+1] = times+1;
                            flag = true;
                        }
                    }
                }
            }
            if(flag){
                times++;;
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return times-1;
    }
}
