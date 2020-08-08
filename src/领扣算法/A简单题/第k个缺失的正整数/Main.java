/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.第k个缺失的正整数;

public class Main {
    public int findKthPositive(int[] arr, int k) {
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if (k==0)
                break;
            if (count!=arr[i]){
                k--;
                count++;
                i--;
            }
            else count++;

        }
        return count+k-1;
    }
}
