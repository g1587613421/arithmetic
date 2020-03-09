/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.解码字母到整数映射;

public class Main {
    public String freqAlphabets(String s) {
        char middle=0;
        for (int i = 26; i >0 ; i--) {
            if (i>=10)
                s=s.replace(""+i+"#",""+(char)('a'-1+i));
            else
                s=s.replace(""+i, ""+(char)('a'-1+i));
        }
        return s;
    }
}
