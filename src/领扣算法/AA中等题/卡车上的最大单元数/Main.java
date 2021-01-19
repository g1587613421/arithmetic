/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.卡车上的最大单元数;

import java.util.Arrays;

public class Main {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1,o2)->(o2[1]-o1[1]));
        int sum=0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize<=0)
                return sum;
            if (truckSize>=boxTypes[i][0]){
                sum+=boxTypes[i][0]+boxTypes[i][1];
            }
            else sum+=boxTypes[i][1]*truckSize;
            truckSize-=boxTypes[i][0];
        }
        return sum;
    }
}
