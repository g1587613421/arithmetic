/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.通过翻转子数组使两个数组相等;

import java.util.Arrays;

public class Main {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=target[i])
                return false;

        }
        return true;
    }
}
