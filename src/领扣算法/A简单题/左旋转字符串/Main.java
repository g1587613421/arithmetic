/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.左旋转字符串;

public class Main {

    public String reverseLeftWords(String s, int n) {
        if (n>=s.length())
            return s;
        return s.substring(n)+s.substring(0, n);
    }
}
