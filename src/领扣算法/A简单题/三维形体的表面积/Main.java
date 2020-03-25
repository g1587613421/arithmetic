/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.三维形体的表面积;

public class Main {

    public int surfaceArea(int[][] grid) {
        int count=0;
        for (int[] ints : grid) {
            int now_height=0;
            for (int anInt : ints) {
                if (anInt!=0)
                    count+=2;
                if (anInt<now_height)
                {
                    now_height=anInt;
                }
                else {
                    count+=(anInt-now_height)*2;
                    now_height = anInt;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int now_height=0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i]<now_height)
                {
                    now_height=grid[j][i];
                }
                else {
                    count+=(grid[j][i]-now_height)*2;
                    now_height = grid[j][i];
                }
            }

        }




        return count;
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().surfaceArea(new int[][]{{1,2},{3,4}});
    }
}
