/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.尽可能使字符串相等;

public class Main {

    public int equalSubstring(String s, String t, int maxCost) {
        int costs[]=new int[s.length()+1];
        for (int i = 0; i < costs.length-1; i++) {
            costs[i+1]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        for (int i = 1; i < costs.length; i++) {
            costs[i]+=costs[i-1];
        }
        int max=0;
        int m=0,n=1;
        while (n<costs.length)
        {
            int middle=costs[n]-costs[m];
            if (middle==maxCost)
            {
                max=Math.max(max, n-m);
                n++;
                continue;
            }
            if (middle>maxCost){
                max=Math.max(max, n-m-1);
                m++;
                continue;
            }
            n++;
            max=Math.max(max, n-m);
        }
        return max;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().equalSubstring("krpgjbjjznpzdfy","nxargkbydxmsgby",14);
    }
}
