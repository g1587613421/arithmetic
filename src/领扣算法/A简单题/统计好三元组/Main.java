/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.统计好三元组;

public class Main {
    //0 <= i < j < k < arr.length
    //|arr[i] - arr[j]| <= a
    //|arr[j] - arr[k]| <= b
    //|arr[i] - arr[k]| <= c
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (Math.abs(arr[i]-arr[j])<=a&&Math.abs(arr[i]-arr[k])<=c&&Math.abs(arr[j]-arr[k])<=b)
                        count++;
                }

            }

        }
        return count;
    }
}
