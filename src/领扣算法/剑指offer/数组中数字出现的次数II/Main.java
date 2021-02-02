/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.数组中数字出现的次数II;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : data.entrySet()) {
            if (integerIntegerEntry.getValue()==1)
                return integerIntegerEntry.getKey();
        }
        return 0;
    }
//    public int singleNumber(int[] nums) {
//        long sum=0;
//        HashSet<Integer> data=new HashSet<>();
//        for (Integer datum : nums) {
//            sum+=datum;
//            data.add(datum);
//
//        }
//        for (Integer datum : data) {
//            sum-=datum*3;
//        }
//        return (int) ((-sum)/2);
//    }
}
