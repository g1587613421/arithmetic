/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.反转字符串II;

public class Main {

    public String reverseStr(String s, int k) {
        StringBuffer middle=new StringBuffer(),res=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ((i/k)%2==0) {
                middle.append(s.charAt(i));
                continue;
            }
            if (i%k==0) {
                res.append(middle.reverse());
                middle=new StringBuffer();
            }
            res.append(s.charAt(i));
        }
        res.append(middle.reverse());
        return res.toString();
    }
}
