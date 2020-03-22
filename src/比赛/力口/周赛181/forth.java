/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛181;

public class forth {

    public String longestPrefix(String s) {
        int max=0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.substring(0,i+1).equals(s.substring(s.length()-i-1)))
            {
                if (s.indexOf(s.substring(0,i+1), i+1)==-1)
                    break;
               max=i+1;
            }

        }
        if (max!=0)
            return s.substring(0,max);
        return "";
    }
}
