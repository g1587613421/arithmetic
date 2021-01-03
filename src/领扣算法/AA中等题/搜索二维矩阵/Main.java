/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.搜索二维矩阵;

public class Main {

    public boolean searchMatrix(int[][] matrix, int target) {
        //确定行
        int r=-1;
        for (int i = 0; i < matrix.length-1; i++) {
                if (matrix[i][0]<=target&&matrix[i+1][0]>=target){
                    r=i;
                    if (matrix[i][0]==target)
                        return true;
                    if (matrix[i+1][0]==target)
                        return true;
                    break;
                }
        }
        r=r==-1?matrix.length-1:r;
        if (matrix[r][0]==target)
            return true;
        matrix[r][0]=target;
        int i;

        for ( i = matrix[0].length-1;matrix[r][i]>target;i--);
        return i!=0&&matrix[r][i]==target;
    }
    public static void main(String arg[]){//main--来自高金磊
        new Main().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}},0 );
    }

}
