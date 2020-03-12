/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.反转字符串中的单词III;

public class Main {

    public String reverseWords(String s) {
        String[] data=s.split(" ");
        for (int i = 0; i < data.length; i++) {
            data[i]=new StringBuffer(data[i]).reverse().toString();
        }
        StringBuffer res=new StringBuffer();
        for (String datum : data) {
            res.append(datum).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
