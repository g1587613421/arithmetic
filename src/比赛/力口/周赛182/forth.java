/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛182;

public class forth {
    public int findGoodStrings(int n, String s1, String s2, String evil) {
        int[] data=new int[n+1];
        data[n]=1;
        for (int i = n-2; i>=0; i--) {
            int middle=s2.charAt(n-1)-s1.charAt(n-1);
            data[i]=((middle-2)<=0?0:(middle-2)*(int) Math.pow(26, n-i-1))+2*data[i+1];
        }
        return data[0];
    }
}
