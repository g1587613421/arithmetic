/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.方阵中战斗力最弱的K行;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public int[] kWeakestRows(int[][] mat, int k) {
        int data[][]=new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int count=0;
            for (int datum : mat[i]) {
                if (datum==1)
                    count++;
                else break;

            }
            data[i]=new int[]{i,count};
        }
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int[] result=new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i]=data[i][0];

        }
        return result;

    }
}
