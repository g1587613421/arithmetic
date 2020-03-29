/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛182;

import java.util.HashMap;

public class first {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int i : arr) {
            data.put(i, data.getOrDefault(i, 0)+1);
        }
        int res=-1;
        for (Integer integer : data.keySet()) {
            if (data.get(integer).equals(integer))
            {
                res=Math.max(res, integer);
            }
        }
        return res;
    }
}
