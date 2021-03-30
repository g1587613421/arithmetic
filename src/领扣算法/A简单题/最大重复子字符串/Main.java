/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.最大重复子字符串;

public class Main {

    public int maxRepeating(String sequence, String word) {
        String middle=word;
        int res=0;
        while (sequence.contains(middle)){
            middle+=word;
            res++;
        }
        return res;
    }
}
