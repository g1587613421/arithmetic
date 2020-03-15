/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛180;

public class forth {
    int max=0;
    int[] speed;
    int[] effic;
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        this.speed=speed;
        this.effic=efficiency;
        for (int i = 0; i < speed.length; i++) {
            max=Math.max(max, efficiency[i]*speed[i]);
            plus(i,efficiency[i],k-1,efficiency[i]*speed[i]);
        }
        return (max%(100000000+7));
    }
    void plus(int i,int min,int per,int effs){
        i++;
        if (per==0||speed.length-i<per){

            return;

        }
        for (int j = i; j < speed.length; j++) {
            int middle=Math.min(min, effic[j]);
            int mmm=(effs/min+speed[j])*middle;
            max=Math.max(max, mmm);
            plus(j, middle, per-1,mmm);
        }
    }
}
