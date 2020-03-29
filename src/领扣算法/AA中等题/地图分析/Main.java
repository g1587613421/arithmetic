/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.地图分析;

public class Main {

    public int maxDistance(int[][] grid) {
        boolean b=true;
        int[][] middle=new int[grid.length+2][grid.length+2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                middle[i+1][j+1]=grid[i][j];
            }
        }
        int[][] middle2=new int[middle.length][middle[0].length];
        for (int i = 0; i < middle.length; i++) {
            middle2[i]=middle[i].clone();
        }
        int max=0;
        while (b){
            b=false;
            for (int i = 1; i < middle.length-1; i++) {
                for (int j = 1; j < middle[0].length-1; j++) {
                    if (middle[i][j]==0) {
                        int a = Math.max(middle2[i - 1][j], Math.max(middle2[i + 1][j], Math.max(middle2[i][j + 1], middle2[i][j - 1])));
                     if (a!=0) {
                         b = true;
                         middle[i][j] =a+1;
                         max = Math.max(max, middle[i][j]);
                     }
                    }
                }

            }
            for (int i = 0; i < middle.length; i++) {
                middle2[i]=middle[i].clone();
            }
        }
      return max-1;
    }
     public static void main(String[] arg){//main--来自高金磊
     
         new Main().maxDistance(new int[][]{{1,0,1},{0,0,0},{1,0,1}});
     }
}
