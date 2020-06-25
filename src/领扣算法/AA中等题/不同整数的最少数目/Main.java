/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.不同整数的最少数目;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int i : arr) {
            data.put(i, data.getOrDefault(i, 0)+1);
        }
        int[][] middledata=new int[data.size()][2];
        int count=0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : data.entrySet()) {
            middledata[count++]=new int[]{integerIntegerEntry.getKey(),integerIntegerEntry.getValue()};
        }
        Arrays.sort(middledata,(a,b)->(a[1]-b[1]));
        for (int[] middledatum : middledata) {
            k-=middledatum[1];
            if (k>=0){
                count--;
            }
            else break;

        }
        return count;

    }
}
