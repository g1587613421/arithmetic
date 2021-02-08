/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.力扣中级算法.矩阵置零;

import java.util.HashSet;

public class Mian {

    public void setZeroes(int[][] matrix) {
        HashSet<Integer> hashSetx=new HashSet<>();
        HashSet<Integer> hashSety=new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0)
                {
                    hashSetx.add(i);
                    hashSety.add(j);
                }

            }

        }
        for (Integer setx : hashSetx) {
            for (int i = 0; i <matrix[0].length; i++) {
                matrix[setx][i]=0;
            }
        }
        for (Integer setx : hashSety) {
            for (int i = 0; i <matrix.length; i++) {
                matrix[i][setx]=0;
            }
        }


    }
}
