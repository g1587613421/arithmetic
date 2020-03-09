/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最长公共子序列;

public class Main {

    public int longestCommonSubsequence(String text1, String text2) {

        if (text1.length()>text2.length())
        {
            String middle=text1;
            text1=text2;
            text2=middle;
        }
        int m=0,n=1;
        int max=0;
        while (n<=text1.length()){
            if (text2.contains(text1.substring(m, n))){
                max=n-m;
                n++;
            }
            else {
                n++;
                m++;
            }
        }
        return max;
    }
}
