/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.求众数II;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    public List<Integer> majorityElement(int[] nums) {
        int i;
        for (i = 0; i <nums.length; i++) {
            data.put(nums[i],1+data.getOrDefault(nums[i],0));
        }
        LinkedList<Integer> res=new LinkedList<>();
        for (Integer integer : data.keySet()) {
            if (data.get(integer)>nums.length/3)
                res.add(integer);
        }
        return res;
    }
}
