/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.有序数组中出现次数超过25的元素;

public class Main {
    public int findSpecialInteger(int[] arr) {
        int pre=arr[0],count=-1;
        for (int i : arr) {
            if (pre==i)
                count++;
            else {
                count=0;
                pre=i;
            }
            if (count>=arr.length/4d)
                return pre;
        }
        return -1;

    }
}
