/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.找到最高海拔;

import java.util.Arrays;

public class Main {
    public int largestAltitude(int[] gain) {
        //前缀
         int data[]=new int[gain.length+1];
        for (int i = 0; i < gain.length; i++) {
            data[i+1]=data[i]+gain[i];
        }
        return Arrays.stream(data).max().getAsInt();
    }
}
