/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.定长子串中元音的最大数目;

import java.util.HashSet;

public class Main {
    HashSet<Character> set=new HashSet<>();
    public int maxVowels(String s, int k) {
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char[] data=s.toCharArray();
        int size=0;
        int MaxSize=0;
        int[] middle=new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            middle[i+1]=middle[i]+(set.contains(data[i])?1:0);
        }
        if (data.length<k){
            return middle[middle.length-1];
        }
        for (int i = k; i < middle.length; i++) {
            MaxSize=Math.max(MaxSize, middle[i]-middle[i-k]);
        }
        return MaxSize;
    }

}
