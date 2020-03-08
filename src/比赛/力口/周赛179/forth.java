/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛179;

import java.util.ArrayList;
import java.util.HashMap;

public class forth {
    int ss=Integer.MAX_VALUE,ste;
    HashMap<Integer, ArrayList<Integer>> data=new HashMap<>();
    public double frogPosition(int n, int[][] edges, int t, int target) {
        int s,e;
        for (int[] edge : edges) {
            s=Math.min(edge[0],edge[1]);
            e=Math.max(edge[0],edge[1]);
            ArrayList<Integer> list=data.getOrDefault(s,new ArrayList<>());
            list.add(e);
            data.put(s,list);
        }
        plus(1, target,1,0);
        if (t<ste)
            return 0;
        if (t>ste&&data.containsKey(target))
            return 0;
        return 1d/ss;
    }

    void plus(int n,int target,int sum,int step){
        if (sum>=ss)
            return;
        if (n==target){
            ss=sum;
            ste=step;
            return;
        }
        ArrayList<Integer> middle=data.getOrDefault(n, new ArrayList<>());
        for (Integer integer : middle) {
            plus(integer, target, sum*middle.size(),step+1);
        }
    }
}
