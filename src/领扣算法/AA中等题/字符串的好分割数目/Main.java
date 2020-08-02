/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.字符串的好分割数目;

import java.util.HashSet;

public class Main {

    public int numSplits(String s) {
        char[] chars=s.toCharArray();
        int[] data=new int[chars.length+1];
        HashSet<Character> hashSet=new HashSet<>();
        data[0]=0;
        for (int i = 0; i < chars.length; i++) {
            hashSet.add(chars[i]);
            data[i+1]=hashSet.size();
        }
        hashSet.clear();
        int data2[]=new int[data.length];
        data2[data.length-1]=0;
        for (int i = chars.length-1;i>=0; i--) {
            hashSet.add(chars[i]);
            data2[i]=hashSet.size();
        }
        int count=0;
        for (int i = 0; i < data.length; i++) {
            count+=data[i]==data2[i]?1:0;

        }
        return count;
    }
}
