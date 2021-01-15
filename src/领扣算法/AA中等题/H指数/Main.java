/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.H指数;

import java.util.Arrays;

public class Main {
    public int hIndex(int[] citations) {
        if (citations.length==0)
            return 0;
        Arrays.sort(citations);
        if (citations.length<citations[0])
            return citations.length;
        int data[]=new int[citations.length];
        for (int i = 0; i <data.length ; i++) {
            data[i]=citations[data.length-i-1];
        }
        for (int i = 0; i < data.length; i++) {
            if(i+1==data[i])
                return data[i];
            if(i+1>data[i])
                return i;
        }
        return 0;
    }
}
