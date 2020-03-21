/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛22;

public class first {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for (int i : arr1) {
            for (int i1 : arr2) {
                if (Math.abs(i-i1)<=d)
                {
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}
