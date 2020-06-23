/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.重新规划路线;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public int minReorder(int n, int[][] connections) {
        HashSet<Integer> connected=new HashSet<>();
        HashSet<Integer> overed=new HashSet<>();
        ArrayList<int[]> data=new ArrayList<>();
       overed.add(0);
        int mm=0;
        for (int[] connection : connections) {
            data.add(connection);
        }
        ArrayList<int[]> middle=new ArrayList<>();
        while (!data.isEmpty())
        {

            middle.clear();
            for (int[] datum : data) {
                if (overed.contains(datum[1])){
                    connected.add(datum[0]);
                }else if (overed.contains(datum[0])){
                    connected.add(datum[1]);
                    mm++;
                }
                else {
                    middle.add(datum);
                }
            }
            data.clear();
            data.addAll(middle);
            overed.clear();
            overed.addAll(connected);
        }
        return mm;
    }
}
