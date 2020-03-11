/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.保持城市天际线;

public class Main {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] he = new int[grid.length];
        int[] ve = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                he[i]=Math.max(grid[i][j],he[i]);
                ve[j]=Math.max(grid[i][j],ve[j]);
            }
        }
        int mm=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                mm+=Math.min(he[i],ve[j])-grid[i][j];
            }
        }
        return mm;
    }
}
