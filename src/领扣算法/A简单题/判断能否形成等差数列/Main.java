/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.判断能否形成等差数列;

import java.util.Arrays;

public class Main {

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length<3){
            return true;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]-arr[i-1]!=arr[i+1]-arr[i]){
                return false;
            }
        }
        return true;
    }
}
