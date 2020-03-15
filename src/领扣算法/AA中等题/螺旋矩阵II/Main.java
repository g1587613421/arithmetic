/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.螺旋矩阵II;

public class Main {
    int[][] res;
    int nox=1,max;
    public int[][] generateMatrix(int n) {
        res=new int[n][n];
        max=n*n;
        plus_D(0, 0);
        return res;
    }
    void plus_R(int x,int y){
        if (max>=nox)
            if (x<res.length&&res[x][y]==0)
            {
                res[x][y]=nox++;
                plus_R(x+1, y);
            }
            else plus_D(x-1,y+1);
    }
    void plus_L(int x,int y){
        if (max>=nox)
            if (x>=0&&res[x][y]==0)
            {
                res[x][y]=nox++;
                plus_L(x-1, y);
            }
            else plus_U(x+1,y-1);
    }
    void plus_U(int x,int y){
        if (max>=nox)
            if (y>=0&&res[x][y]==0)
            {
                res[x][y]=nox++;
                plus_U(x, y-1);
            }
            else plus_R(x+1,y+1);
    }
    void plus_D(int x,int y){
        if (max>=nox)
            if (y<res[0].length&&res[x][y]==0)
            {
                res[x][y]=nox++;
                plus_D(x, y+1);
            }
            else plus_L(x-1,y-1);
    }
}
