/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.使数组唯一的最小增量;

import java.util.Arrays;

public class Main {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        if (A.length<2)
            return 0;
        int max=A[0];
        int count=0;
        for (int i = 1; i <A.length ; i++) {
            if (max>=A[i]) {
                count += max-A[i]+1;
                max=max+1;
            }
            else
                max=A[i];
        }

        return count;
    }
}
