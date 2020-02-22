/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.分割平衡字符串;

public class Main {
    int cou=0;
    public int balancedStringSplit(String s) {
        if (s.length()==0)
            return cou;
        int middle=0;
        for (char c : s.toCharArray()) {
            middle+=c=='L'?-1:1;
            cou+=middle==0?1:0;
        }
        return cou;
    }
}
