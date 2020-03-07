/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字符的最短距离;

public class Main {
    int[] res;
    public int[] shortestToChar(String S, char C) {
        res = new int[S.length()];
        for (int i = 0; i < res.length; i++) {
            res[i]=S.charAt(i)==C?0:Integer.MAX_VALUE;
        }
        boolean flag=false;
        for (int i = 0; i < res.length; i++) {
            if (res[i]==0) {
                flag = true;
                continue;
            }
            if (!flag)
                continue;
            res[i]=res[i-1]+1;
        }
        for (int i = res.length-2; i >=0 ; i--) {
            res[i]=Math.min(res[i],res[i+1]+1);
        }
        return res;
    }
}
