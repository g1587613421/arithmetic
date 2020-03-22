/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.两地调度;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]-o1[0])-(o2[1]-o2[0]);
            }
        });
        int cost=0;
        for (int i = 0; i < costs.length/2; i++) {
            cost+=costs[i][1];
        }
        for (int i = costs.length/2; i < costs.length; i++) {
            cost+=costs[i][0];
        }
        return cost;
    }
}
