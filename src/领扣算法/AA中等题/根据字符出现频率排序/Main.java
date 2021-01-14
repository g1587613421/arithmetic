/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.根据字符出现频率排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public String frequencySort(String s) {
        char[] data=s.toCharArray();
        HashMap<Character,Integer> middle=new HashMap<>();
        for (char datum : data) {
            middle.put(datum, middle.getOrDefault(datum, 0)+1);
        }
        int[][] res=new int[middle.size()][2];
        int mm=0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : middle.entrySet()) {
            res[mm++]=new int[]{characterIntegerEntry.getValue(),characterIntegerEntry.getKey()};
        }
        Arrays.sort(res, (a,b)->(b[0]-a[0]));
        StringBuffer stringBuffer=new StringBuffer();
        for (int[] re : res) {
            for (int i = 0; i < re[0]; i++) {
                stringBuffer.append((char)re[1]);
            }
        }
        return stringBuffer.toString();
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().frequencySort("tree");
    }
}
