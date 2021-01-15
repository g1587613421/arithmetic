/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.移除最多的同行或同列石头;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public int removeStones(int[][] stones) {
        HashMap<Integer,Integer> rel=new HashMap<>(),cow=new HashMap<>();;
        for (int[] stone : stones) {
            rel.put(stone[0],rel.getOrDefault(stone[0],0)+1);
            cow.put(stone[1],cow.getOrDefault(stone[1],0)+1);
        }
        Arrays.sort(stones, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return -((rel.get(o1[0])>1?1:0)+(cow.get(o1[1])>1?1:0)-(rel.get(o2[0])>1?1:0)-(cow.get(o2[1])>1?1:0));
            }
        });

        HashSet<Integer> data1=new HashSet<>(),data2=new HashSet<>();
        int res=0;
        for (int[] stone : stones) {
            if (!data1.contains(stone[0])&&!data2.contains(stone[1])){
                res++;
            }
            data1.add(stone[0]);
            data2.add(stone[1]);
        }
        return stones.length-res;
    }

    public static void main(String arg[]){//main--来自高金磊

        new Main().removeStones(new int[][]{{0,1},{1,1},{1,0}});
    }
}
