/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.逐步求和得到正数的最小值;

import java.util.Arrays;

public class Main {

    public int minStartValue(int[] nums) {
        int data[]=new int[nums.length+1];
        data[0]=0;
        for (int i = 0; i <nums.length ; i++) {
            data[i+1]=data[i]+nums[i];
        }
       return 1-Arrays.stream(data).min().getAsInt();
    }
}
