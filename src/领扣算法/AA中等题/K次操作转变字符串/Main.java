/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.K次操作转变字符串;

import java.util.Arrays;

public class Main {

    public boolean canConvertString(String s, String t, int k) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        if (chars1.length != chars2.length)
            return false;
        int data[] = new int[chars1.length];
        for (int i = 0; i < chars1.length; i++) {
            data[i] = chars2[i] - chars1[i];
            data[i] += data[i] < 0 ? 26 : 0;
        }
      //快速Hash
        int[] hash=new int[26];
        for (int i = 0; i < hash.length; i++) {
            hash[i]-=26-i;
        }
        for (int i = 0; i < data.length; i++) {
            hash[data[i]]+=26;
        }
        hash[0]=0;
        return Arrays.stream(hash).max().getAsInt()<=k;
    }

//    //time_out
//    public boolean canConvertString(String s, String t, int k) {
//        char[] chars1 = s.toCharArray();
//        char[] chars2 = t.toCharArray();
//        if (chars1.length != chars2.length)
//            return false;
//        int data[] = new int[chars1.length];
//        for (int i = 0; i < chars1.length; i++) {
//            data[i] = chars2[i] - chars1[i];
//            data[i] += data[i] < 0 ? 26 : 0;
//        }
//        Arrays.sort(data);
//        HashSet<Integer> res=new HashSet<>();
//        for (int i = 0; i < data.length; i++) {
//            if (data[i]==0)
//                continue;
//            while (res.contains(data[i])){
//                data[i]+=26;
//            }
//            if (data[i]>k)
//                return false;
//            res.add(data[i]);
//
//        }
//
//        return true;
//    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().canConvertString("atmtxzjkz"
                ,"tvbtjhvjd"
                ,35);
    }
}
