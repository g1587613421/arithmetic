/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.大小为K且平均值大于等于阈值的子数组数目;

public class Main {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] data=new int[arr.length+1];
        data[0]=0;
        for (int i = 1; i < arr.length+1; i++) {
            data[i]=data[i-1]+arr[i-1];
        }
        int count=0;
        for (int i = 0; i < data.length-k; i++) {
            if (data[i+k-1]-data[i]>=threshold*k)
                count++;
        }
        return count;
    }
}
