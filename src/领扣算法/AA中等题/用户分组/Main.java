/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.用户分组;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int[][] data=new int[groupSizes.length][2];
        for (int i = 0; i < groupSizes.length; i++) {
            data[i]=new int[]{groupSizes[i],i};

        }
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<List<Integer>> result=new LinkedList<>();
        List<Integer> res;

        for (int i = 0; i < data.length;) {
            int middle=i;
            i+=data[i][0];
            res = new LinkedList<>();
            for (int j = middle; j <middle+data[middle][0] ; j++) {
                res.add(data[j][1]);
            }
            result.add(res);
        }
        return result;
    }
}
