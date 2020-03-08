/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛179;

public class third {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int[] time=new int[n];
        for (int i = 0; i < n; i++) {
            time[i]=-1;
        }
        time[headID]=0;
        boolean b=true;
        while (b){
            b=false;
            for (int i = 0; i < n; i++) {
                if (time[i]==-1){
                    b=true;
                    if (time[manager[i]]!=-1){
                        time[i]=time[manager[i]]+informTime[manager[i]];
                    }
                }
            }
        }
        int max=0;
        for (int i : time) {
            max=Math.max(max, i);
        }
        return max;
    }
}
