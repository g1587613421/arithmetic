/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.两句话中的不常见单词;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public String[] uncommonFromSentences(String A, String B) {
        String[] middle=A.split(" ");
        String[] middle1=B.split(" ");
        HashMap<String,Integer> data=new HashMap<>();
        HashMap<String,Integer> data1=new HashMap<>();
        for (String s : middle) {
            data.put(s, data.getOrDefault(s, 0)+1);
        }
        for (String s : middle1) {
            data1.put(s, data1.getOrDefault(s, 0)+1);
        }
        ArrayList<String> resu=new ArrayList<>();
        for (String s : data.keySet()) {
            if (data.get(s)==1&&!data1.containsKey(s)){
                resu.add(s);
            }
            data1.remove(s);
        }
        for (String s : data1.keySet()) {
            if (data1.get(s)==1)
                resu.add(s);
        }
        String[] res = new String[resu.size()];
        resu.toArray(res);

        return res;
    }
}
