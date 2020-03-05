/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.公交站间的距离;

public class Main {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        for (int i : distance) {
            sum+=i;
        }
        if (start>destination) {
            int middle = start;
            start=destination;
            destination=middle;
        }
        int de=0;
        for (int i = start; i < destination+1; i++) {
            de+=distance[i];
        }
        return Math.min(de, sum-de);

    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().distanceBetweenBusStops(new int[]{1,2,3,4}, 3, 0);
    }
}
