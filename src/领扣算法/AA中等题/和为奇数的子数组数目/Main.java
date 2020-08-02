/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.和为奇数的子数组数目;

import java.util.Arrays;

public class Main {
    public int numOfSubarrays(int[] arr) {
        long count=0L;
        for (int i = 0; i < arr.length; i++) {
            arr[i]%=2;
        }
        int data[]=new int[arr.length+1];
        data[0]=0;
        for (int i = 0; i < arr.length; i++) {
            data[i+1]=(data[i]+arr[i])%2;
        }
        long aa= Arrays.stream(data).sum();
        long aa2=data.length-aa;
        count=aa*aa2;
        return (int) (count%1000000007);
    }
}
