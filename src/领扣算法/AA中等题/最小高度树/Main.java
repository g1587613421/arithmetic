/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.最小高度树;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    HashMap<Integer,LinkedList<Integer>> data;
    int[] res;
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        data = new HashMap<>();
        res = new int[n];
        for (int[] edge : edges) {
            LinkedList<Integer> middle=data.getOrDefault(edge[0],new LinkedList<Integer>());
            middle.add(edge[1]);
            data.put(edge[0],middle);
            middle=data.getOrDefault(edge[1],new LinkedList<Integer>());
            middle.add(edge[0]);
            data.put(edge[1],middle);
        }
        for (int i = 0; i < res.length; i++) {
            res[i]=res[i]==0?plus(i,-1):res[i];
        }
        int target=Arrays.stream(res).min().getAsInt();
        LinkedList<Integer> result=new LinkedList<>();
        for (int i = 0; i < res.length; i++) {
            if (res[i]==target)
                result.add(i);
        }
        return result;
    }

    private int plus(int i,int last) {
        int max=0;
        LinkedList<Integer> mm=data.getOrDefault(i,new LinkedList<>());
        for (Integer integer : mm) {
            if (integer!=last){
                res[integer]=res[integer]==0?plus(integer,i):res[integer];
                max=Math.min(max,res[integer]);
            }

        }
        return max+1;
    }
}
