/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.矩阵区域和;

public class Main {

    public int[][] matrixBlockSum(int[][] mat, int K) {
        //构造二维最小前缀和
        int[][] middle = new int[mat.length + 1][mat[0].length + 1];
        middle[1][1]=mat[0][0];
        for (int i = 1; i < mat.length+1; i++) {
            middle[i][1]=middle[i-1][1]+mat[i-1][0];
        }
        for (int i = 1; i <mat[0].length+1; i++) {
            middle[1][i]=middle[1][i-1]+mat[0][i-1];
        }
        for (int i = 1; i <mat.length+1 ; i++) {
            for (int j = 1; j < mat[0].length+1; j++) {
                middle[i][j]=middle[i-1][j]+middle[i][j-1]-middle[i-1][j-1]+mat[i-1][j-1];
            }
        }
        int[][] res = new int[mat.length][mat[0].length];
        int x,y,w,z;
        for (int i = 0; i < mat.length; i++) {
            x=i+K+1;
            x=(x>=middle.length)?middle.length-1:x;
            z=i-K;
            z=z<0?0:z;
            for (int j = 0; j < mat[0].length; j++) {
                y=j+K+1;
                y=y>middle[0].length-1?middle[0].length-1:y;
                w=j-K;
                w=w<0?0:w;
                res[i][j]=middle[x][y]-middle[x][w]-middle[z][y]+middle[z][w];
            }

        }

        return res;
    }
}
