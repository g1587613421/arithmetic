/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.前K个高频元素;

import java.util.*;

public class Main {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0)+1);
        }
        LinkedList<Map.Entry<Integer,Integer>> middle=new LinkedList<>(data.entrySet());
        Collections.sort(middle,(a,b)->(b.getValue()-a.getValue()));
        int[] res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=middle.pollFirst().getKey();
        }

        return res;

    }
}
