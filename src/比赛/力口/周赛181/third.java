/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛181;

import java.util.LinkedList;

public class third {
    public boolean hasValidPath(int[][] grid) {
        int x=0,y=0;
        LinkedList<int[]> linkedList=new LinkedList<>();
        while (x<grid.length&&y<grid[0].length){
            if (x==grid.length-1&&y==grid[0].length-1)
                return true;
            switch (grid[x][y]){
                case 1:
                    grid[x][y]=0;
                    y++;
                    if (y!=grid[0].length)
                    if (grid[x][y]==1||grid[x][y]==3||grid[x][y]==5){
                        y-=2;
                        if (y>=0&&(grid[x][y]==1||grid[x][y]==4||grid[x][y]==6)){
                            linkedList.add(new int[]{x,y});
                            y+=2;
                        }
                        break;
                    }
                    y-=2;
                    if (y>=0&&(grid[x][y]==1||grid[x][y]==4||grid[x][y]==6))
                    break;
                    return false;
                case 2:
                    grid[x][y]=0;
                    x++;
                    if (x!=grid.length)
                    if (grid[x][y]==2||grid[x][y]==5||grid[x][y]==6){

                        x-=2;
                        if (x>=0&&(grid[x][y]==5||grid[x][y]==4||grid[x][y]==3)) {
                            linkedList.add(new int[]{x, y});
                            x+=2;
                        }
                        break;}
                    x-=2;
                    if (x>=0&&(grid[x][y]==5||grid[x][y]==4||grid[x][y]==3))
                    break;
                return false;
                case 3:
                    grid[x][y]=0;
                    y++;
                    if (y!=grid[0].length)
                    if (grid[x][y]==2||grid[x][y]==3||grid[x][y]==5)
                        break;
                    y--;
                    x++;
                    if (x<grid.length&&(grid[x][y]==2||grid[x][y]==5||grid[x][y]==6))
                    break;
                return false;
                case 4:
                    grid[x][y]=0;
                    y++;
                    if (y!=grid[0].length)
                    if (grid[x][y]==1||grid[x][y]==3||grid[x][y]==5)
                        break;
                    y--;
                    x++;
                    if (x<grid.length&&(grid[x][y]==2||grid[x][y]==5||grid[x][y]==6))
                        break;
                    return false;
                case 5:
                    grid[x][y]=0;
                    y--;
                    if (y>=0)
                    if (grid[x][y]==1||grid[x][y]==4||grid[x][y]==6)
                        break;
                    y++;
                    x--;
                    if (x>=0&&(grid[x][y]==3||grid[x][y]==4||grid[x][y]==2))
                        break;
                    return false;
                case 6:
                    grid[x][y]=0;
                    y++;
                    if (y!=grid[0].length)
                    if (grid[x][y]==1||grid[x][y]==3||grid[x][y]==5)
                        break;
                    y--;
                    x--;
                    if (x>=0&&(grid[x][y]==2||grid[x][y]==5||grid[x][y]==6))
                        break;
                    return false;

            }
        }

        return x==grid.length-1&&y==grid[0].length-1;
    }
    
    
    
    public static void main(String[] arg){//main--来自高金磊
    
        System.out.println(new third().hasValidPath(new int[][]{{4,1},{6,1}}));
    }
}
