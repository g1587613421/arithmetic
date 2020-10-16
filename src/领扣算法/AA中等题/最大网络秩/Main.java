/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最大网络秩;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public int maximalNetworkRank(int n, int[][] roads) {
        Set<Double>[] data=new HashSet[n];
        for (int i = 0; i < n; i++) {
            data[i]=new HashSet<Double>();
        }
        for (int i = 0; i < roads.length; i++) {
            int min=Math.min(roads[i][0],roads[i][1]);
            int max=Math.max(roads[i][0],roads[i][1]);
            data[roads[i][0]].add(0.001*max+min);
            data[roads[i][1]].add(0.001*max+min);
        }
        int res=0;
        Arrays.sort(data,(a,b)->(b.size()-a.size()));
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                Set<Double> mm=new HashSet<>();
                mm.addAll(data[i]);
                mm.addAll(data[j]);
               int middle=mm.size();
               res=Math.max(res, middle);
            }

        }
        return res;
    }
}
