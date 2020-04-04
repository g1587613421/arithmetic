/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最大正方形;

public class Main {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length==0)
            return 0;
        int data[][]=new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                data[i+1][j+1]=matrix[i][j]=='1'?1:0;
            }
        }
        int max=0;
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[0].length; j++) {
                if (data[i][j]==1){
                    data[i][j]+=Math.min(Math.min(data[i-1][j],data[i-1][j-1]), data[i][j-1]);
                  max=Math.max(data[i][j],max);
                }
            }
        }
        return max*max;
    }
}
