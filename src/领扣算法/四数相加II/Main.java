/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.四数相加II;

import java.util.HashMap;

public class Main {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer,Integer> dAB=new HashMap<>();
        HashMap<Integer,Integer> dCD=new HashMap<>();
        for (int i : A) {
            for (int i1 : B) {
                dAB.put(i+i1, dAB.getOrDefault(i+i1, 0)+1);
            }
        }
        for (int i : C) {
            for (int i1 : D) {
                dCD.put(i+i1, dCD.getOrDefault(i+i1, 0)+1);
            }
        }
        int count=0;
        for (Integer integer : dAB.keySet()) {
            count+=dAB.getOrDefault(integer, 0)*dCD.getOrDefault(-integer, 0);
        }
        return count;
    }
}
