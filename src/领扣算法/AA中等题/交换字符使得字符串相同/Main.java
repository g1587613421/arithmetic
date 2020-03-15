/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.交换字符使得字符串相同;


public class Main {
    public int minimumSwap(String s1, String s2) {
       int count=0;
       if (s1.length()!=s2.length())
           return -1;
        int[] ss1 = new int[2];
        int[] ss2 = new int[2];
       char c1,c2;
        for (int i = 0; i <s1.length() ; i++) {
            c1=s1.charAt(i);
            c2=s2.charAt(i);
            if (c1==c2)
                continue;
            ss1[c1-'x']+=1;
            ss2[c2-'x']+=1;
        }
        if ((ss1[0]+ss2[0])%2!=0)
            return -1;
        count+=ss1[0]/2+ss1[1]/2+(ss1[0]%2==0?0:2);

        return count;
    }
}
