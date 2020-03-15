/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛180;

import java.util.ArrayList;
import java.util.List;

public class first {
    List<Integer> res=new ArrayList<>();
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min;
        int index;
        int[] max=new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max[i]=Math.max(matrix[j][i],max[i]);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            index=0;
            min = Integer.MAX_VALUE;
            for (int j = 0; j <matrix[0].length ; j++) {
                if (min>matrix[i][j]){
                    min=matrix[i][j];
                    index=j;
                }
            }
            if (matrix[i][index]==max[index])
                res.add(matrix[i][index]);

        }
        return res;
    }
}
