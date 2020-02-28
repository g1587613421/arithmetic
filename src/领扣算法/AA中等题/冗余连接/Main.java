/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.冗余连接;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    HashMap<Integer, LinkedList<int[]>> data=new HashMap<>();
    LinkedList<Integer> edge;
    int min_=-1;
    LinkedList<int[]> path=new LinkedList<>();
    public int[] findRedundantConnection(int[][] edges) {
        for (int i = 0; i < edges.length; i++) {
            LinkedList<int[]> middle=data.getOrDefault(edges[i][0],new LinkedList<>());
            middle.add(new int[]{edges[i][1],i});
            data.put(edges[i][0],middle);
            middle=data.getOrDefault(edges[i][1],new LinkedList<>());
            middle.add(new int[]{edges[i][0],i});
            data.put(edges[i][1],middle);
        }
        edge=new LinkedList<>();
        for (Integer integer : data.keySet()) {
            if (!edge.contains(integer)&&min_==-1){
                LinkedList<int[]> re=new LinkedList<>();
                re.add(new int[]{integer,-1});
                plus(integer, integer,re);
            }
        }
        while (path.getFirst()[0]!=min_){
            System.out.println(path.getFirst()[0]);
            path.removeFirst();
        }
        path.removeFirst();
        min_=-1;
        for (int[] ints : path) {
            System.out.println(ints[1]);
            min_=Math.max(min_, ints[1]);
        }
        return edges[min_];
    }
    void plus(int now,int pre,LinkedList<int[]> pat){
        edge.add(now);
        for (int[] ints : data.get(now)) {
            if (min_!=-1)
                return;
            if (ints[0]!=pre){//不回头
                if (edge.contains(ints[0])){
                    min_=ints[0];
                    pat.addLast(ints);
                    path=pat;
                }
                else {
                    LinkedList<int[]> middle=new LinkedList<>(pat);
                    middle.addLast(ints);
                    plus(ints[0],now,middle);
                }
            }
        }

    }
    public static void main(String arg[]){//main--来自高金磊

     new Main().findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}});
    }
}
