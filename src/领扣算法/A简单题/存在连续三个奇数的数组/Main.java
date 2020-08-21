/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.存在连续三个奇数的数组;

public class Main {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for (int i : arr) {
            if (i%2==1){
                count++;
                if (count==3)
                    return true;
            }
            else count=0;

        }
        return false;
    }
}
