/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.分糖果II;

public class Main {

    public int[] distributeCandies(int candies, int num_people) {
        int pcan=0;
        int[] res=new int[num_people];
        while (candies>0){
            for (int i = 0; i < num_people; i++) {
                if (pcan+1<=candies){
                    res[i]+=++pcan;
                    candies-=pcan;
                }
                else {
                    res[i] += candies;
                    candies=0;
                    break;
                }
            }
        }
        return res;
    }
}
