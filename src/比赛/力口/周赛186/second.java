/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛186;

public class second {

    public int maxScore(int[] cardPoints, int k) {
        int data[]=new int[k*2];
        for (int i = 0; i < k; i++) {
            data[i]=cardPoints[cardPoints.length-k+i];
            data[i+k]=cardPoints[i];
        }
        int sum=0;
        for (int i = 1; i < data.length; i++) {
            data[i]+=data[i-1];
        }
        sum=data[k-1];
        for (int i = k; i <data.length ; i++) {
            sum=Math.max(sum, data[i]-data[i-k]);
        }
        return sum;
    }

    public static void main(String arg[]){//main--来自高金磊

        new second().maxScore(new int[]{1,2,3,4,5,6,1}, 3);
    }
}
