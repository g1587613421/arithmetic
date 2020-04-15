/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.对角线遍历;

public class Main {
    int matrix[][];
    int res[];
    int middle=0;
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length==0)
            return new int[0];
        res=new int[matrix.length*matrix[0].length];
        this.matrix=matrix;
        plusRU(0, 0);
        return res;
    }

    private void plusRU(int x,int y){
        while (check(x, y)){
            res[middle++]=matrix[x][y];
            x--;
            y++;
        }
       if (check(x+1, y))
       {
           plusLD(x+1, y);
       }
       else if (check(x+2,y-1)) plusLD(x+2,y-1);

    }
    private void plusLD(int x,int y){
        while (check(x, y)){
            res[middle++]=matrix[x][y];
            x++;
            y--;
        }
        if (check(x, y+1))
        {
            plusRU(x, y+1);
        }
        else if (check(x-1,y+2)) plusRU(x-1,y+2);
    }
    private boolean check(int x,int y){
        return x>=0&&y>=0&&x<matrix.length&&y<matrix[0].length;
    }
}
