/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.制造字母异位词的最小步骤数;

import java.util.HashMap;

public class Main {
    HashMap<Character,Integer> data=new HashMap<>();
    int count=0;
    public int minSteps(String s, String t) {
        for (char c : s.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        for (char c : t.toCharArray()) {
            data.put(c, data.getOrDefault(c,0)-1);
        }
        for (Integer value : data.values()) {
            count+=Math.abs(value);
        }
        return count/2;
    }
}
