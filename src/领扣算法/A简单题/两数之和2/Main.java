/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.两数之和2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Integer,Integer> middle=new HashMap<>();
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (middle.containsKey(target-numbers[i])){
//                return new int[]{Math.min(i+1, middle.get(target-numbers[i])),Math.max(i+1, middle.get(target-numbers[i]))};
                return new int[]{middle.get(target-numbers[i]),i+1};
            }
            middle.put(numbers[i],i+1);
        }
        return null;
    }
}
