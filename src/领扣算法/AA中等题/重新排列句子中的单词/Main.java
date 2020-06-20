/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.重新排列句子中的单词;

import java.util.Arrays;

public class Main {
    public String arrangeWords(String text) {
        String[] data=text.split(" ");
        Arrays.sort(data,(a,b)->(a.length()-b.length()));
        StringBuffer res=new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            if (i==0){
               res.append(data[i].substring(0, 1).toUpperCase()).append(data[i].substring(1));
            }else
                res.append(data[i].toLowerCase());
            res.append(" ");
        }
        if (res.length()>0){
            res.deleteCharAt(res.length()-1);
        }
        return res.toString();

    }
}
