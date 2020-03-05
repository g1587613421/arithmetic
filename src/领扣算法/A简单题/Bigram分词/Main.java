/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.Bigram分词;

import java.util.ArrayList;

public class Main {
    public String[] findOcurrences(String text, String first, String second) {
        String data[]=text.split(" ");
        ArrayList<String> res=new ArrayList<>();
        for (int i = 0; i < data.length-2; i++) {
            if (first.equals(data[i])&&second.equals(data[i+1]))
                res.add(data[i+2]);
        }
        String result[]=new String[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=res.get(i);
        }
        return result;
    }
}
