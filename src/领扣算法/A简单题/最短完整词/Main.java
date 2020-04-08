/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最短完整词;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> data=plus(licensePlate);
        Arrays.sort(words,(o1,o2)->(o1.length()-o2.length()));
        int max=0;
        String mmm="";
        for (String word : words) {
            int len=0;
            HashMap<Character,Integer> middle=plus(word);
            for (Character character : data.keySet()) {
                len+=Math.min(data.get(character), middle.getOrDefault(character, 0));
            }
            if (max<len){
                max=len;
                mmm=word;
            }
        }
        return mmm;
    }
    private HashMap<Character,Integer> plus(String ss){
        ss=ss.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : ss.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }
}
