/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.加油站;

public class Main {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            gas[i]-=cost[i];
        }
        int lastgas;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i]<0)
                continue;
            lastgas=gas[i];
            int j;
            for ( j =1; j < gas.length; j++) {
                lastgas+=gas[(i+j)%gas.length];
                if (lastgas<0)
                    break;
            }
            if (j==gas.length)
                return i;
        }
        return -1;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
    }
}
