/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.旋转矩阵;

public class Main {

    public void rotate(int[][] matrix) {
            int N = matrix.length;
            // 角矩形长宽
            int height = N / 2;
            int width = N % 2 == 0 ? N / 2 : N / 2 + 1;
            // 换角
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[N - 1 - j][i]; // 左下角对应的位置
                    matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j]; // 右下角对应的位置
                    matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i]; // 右上角对应的位置
                    matrix[j][N - 1 - i] = temp;
                }
            }

    }
        
        public static void main(String arg[]){//main--来自高金磊
        
            new Main().rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        }
}
