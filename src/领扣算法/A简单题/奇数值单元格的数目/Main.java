/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.奇数值单元格的数目;

import java.util.HashMap;

public class Main {
    public int oddCells(int n, int m, int[][] indices) {
        HashMap<Integer,Integer> dax=new HashMap<>(),day=new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            dax.put(indices[i][0],dax.getOrDefault(indices[i][0],0)+1);
            day.put(indices[i][1],day.getOrDefault(indices[i][1],0)+1);
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((dax.getOrDefault(i, 0)+day.getOrDefault(j, 0))%2==1)
                    count++;
            }

        }
        return count;
    }
}
