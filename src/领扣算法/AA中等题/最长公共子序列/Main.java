/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最长公共子序列;

public class Main {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] ts=text1.toCharArray();
        char[] ts2=text2.toCharArray();
        int[][] data = new int[ts.length + 1][ts2.length + 1];
        for (int i = 1; i <data.length ; i++) {
            for (int j = 1; j < data[0].length; j++) {
                if (ts[i-1]==ts2[j-1])
                    data[i][j]=data[i-1][j-1]+1;
                else
                    data[i][j]=Math.max(data[i][j-1],data[i-1][j]);
            }
        }
        return data[data.length-1][data[0].length-1];
    }
}
