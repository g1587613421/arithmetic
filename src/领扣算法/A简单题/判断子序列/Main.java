/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.判断子序列;

public class Main {

    public boolean isSubsequence(String s, String t) {
        char[] t_data=t.toCharArray();
        char[] s_data=s.toCharArray();
        if (s.length()==0)
            return true;
        int index=0;
        for (int i = 0; i < t_data.length; i++) {
            if (t_data[i]==s_data[index])
            {
             if (++index>s_data.length-1)
                 return true;
            }

        }
        return false;
    }
}
