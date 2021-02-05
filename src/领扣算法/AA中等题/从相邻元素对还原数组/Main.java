/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.从相邻元素对还原数组;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer,Integer> data=new HashMap<>();
        HashMap<Integer,Integer> middle=new HashMap<>();
        for (int[] adjacentPair : adjacentPairs) {
            if (data.containsKey(adjacentPair[0]))
                data.put(adjacentPair[1],adjacentPair[0]);
            else
                data.put(adjacentPair[0],adjacentPair[1]);
            middle.put(adjacentPair[0],middle.getOrDefault(adjacentPair[0],0)+1);
            middle.put(adjacentPair[1],middle.getOrDefault(adjacentPair[1],0)+1);
        }
        int start=0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : middle.entrySet()) {
            if (integerIntegerEntry.getValue()==1)
            {
                start=integerIntegerEntry.getKey();
                if (data.containsKey(data.get(start)));
                break;
            }
        }
        int[] res=new int[adjacentPairs.length+1];
        res[0]=start;
        for (int i = 1; i < res.length; i++) {
            start=data.get(start);
            res[i]=start;

        }
        return res;

    }
}
