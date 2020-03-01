/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组序号转换;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length<1)
            return arr;
        int data[][]=new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            data[i]=new int[]{i,arr[i]};
        }
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int middle=data[0][1];
        arr[data[0][0]]=1;
        for (int i = 1; i < arr.length; i++) {
            if (middle==data[i][1])
                arr[data[i][0]]=arr[data[i-1][0]];
            else {
                arr[data[i][0]] = arr[data[i-1][0]] + 1;
                middle=data[i][1];
            }
        }
        return arr;
    }
}
