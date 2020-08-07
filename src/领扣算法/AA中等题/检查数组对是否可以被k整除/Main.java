/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.检查数组对是否可以被k整除;

public class Main {
    int[] data;
    public boolean canArrange(int[] arr, int k) {
        data=new int[k];
        for (int i : arr) {
            data[i<0?(k+i%k)%k:i%k]++;
        }
        if (k==2){
            return data[1]%2==0;
        }
        for (int i = 1; i < data.length; i++) {
            if (data[i]!=data[k-i]){
                return false;
            }
        }
        return true;
    }
}
