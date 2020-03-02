/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.距离相等的条形码;

import java.util.*;

public class Main {

    public int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length<3)
            return barcodes;
        HashMap<Integer,Integer> data=new HashMap<>();
        for (Integer integer : barcodes) {
            data.put(integer, data.getOrDefault(integer, 0)+1);
        }
        int da[][]=new int[data.size()][2];
        int i=0;
        for (Integer integer : data.keySet()) {
            da[i++]=new int[]{integer,data.get(integer)};
        }
        for (int j = 0; j < barcodes.length; j++) {
            plus(da);
            barcodes[j]=da[0][0];
            if (++j >= barcodes.length)
                break;
            da[0][1]-=1;
            barcodes[j]=da[1][0];
            da[1][1]-=1;

        }
        return barcodes;

    }

    void plus(int[][] da){
        Arrays.sort(da,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
    }
}
