/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.好数对的数目;

import java.util.HashMap;

public class Main {
    HashMap<Integer,Integer> data=new HashMap<>();
    public int numIdenticalPairs(int[] nums) {
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0)+1);
        }
        int count=0;
        for (Integer value : data.values()) {
            if (value>1){
                count+=value*(value-1)/2;
            }
        }
        return count;
    }
}
