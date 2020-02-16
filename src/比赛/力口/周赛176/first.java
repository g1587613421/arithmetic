/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛176;

public class first {
    int count=0;
    public int countNegatives(int[][] grid) {

        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt<0)
                    count++;
            }
        }


        return count;
    }
}
