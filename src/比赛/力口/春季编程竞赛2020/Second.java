/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020;

import java.util.ArrayList;
import java.util.HashMap;

public class Second {
    HashMap<Integer, ArrayList<Integer>> data=new HashMap<>();
    int sum=0;
    public int numWays(int n, int[][] relation, int k) {
        for (int[] ints : relation) {
            ArrayList<Integer> middle=data.getOrDefault(ints[0],new ArrayList<>());
            middle.add(ints[1]);
            data.put(ints[0],middle);
        }
        plus(n, 0, k);
        return sum;

    }
    void plus(int n,int per,int k){
        if (k<0)
            return;
        if (k==0){
            if (per==n-1)
                sum++;
            return;
        }
        for (Integer integer : data.getOrDefault(per, new ArrayList<>())) {
            plus(n, integer, k-1);
        }
    }
}
