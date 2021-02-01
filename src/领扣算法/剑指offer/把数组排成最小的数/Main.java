/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.把数组排成最小的数;

import java.util.Arrays;

public class Main {
    public String minNumber(int[] nums) {
        Integer[] data=new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            data[i]=nums[i];
        }
        Arrays.sort(data, (a,b)->((""+a+b)).compareTo(""+b+a));
        StringBuffer stringBuffer=new StringBuffer();
        for (Integer datum : data) {
            stringBuffer.append(datum);
        }
        return stringBuffer.toString();
    }

}
