/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class first {

    public String sortString(String s) {
        ArrayList<Character> siz;
        HashMap<Character,Integer> data=new HashMap<>();
        for (char c : s.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        siz=new ArrayList<>(data.keySet());
        Collections.sort(siz);
        StringBuffer middle=new StringBuffer();
        StringBuffer res=new StringBuffer();
        int n=0;
        while (res.length()<s.length()){
            for (Character character : siz) {
                if (data.get(character)>0) {
                    middle.append(character);
                    data.put(character, data.get(character)-1);
                }
            }
            if (n++%2==1)
                middle.reverse();
            res.append(middle);
            middle=new StringBuffer();
        }
        return res.toString();
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new first().sortString("aaabbbccc");
    }
}
