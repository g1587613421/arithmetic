/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.字符串中不同整数的数目;

import java.util.HashSet;

public class Main {
    public int numDifferentIntegers(String word) {
        char[] data=word.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i]<'0'||data[i]>'9'){
                data[i]=' ';
            }
        }
        word=new String(data);
        while (word.contains("  ")){
            word=word.replaceAll("  "," ");
        }
        HashSet<String> res=new HashSet<>();
        for (String s : word.split(" ")) {
            if (!s.equals(""))
                res.add(plus(s));
        }
        return res.size();
    }
    private String plus(String s){
        while (s.startsWith("0"))
            s=s.replaceFirst("0", "");
        return s;
    }
}
