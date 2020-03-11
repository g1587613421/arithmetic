/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.有序数组的平方;

import java.util.Arrays;

public class Main {
    int i=0;
    public int[] sortedSquares(int[] A) {

        for (int i1 : A) {
            A[i++]*=i1;
        }
        Arrays.sort(A);
        return A;
    }
}
