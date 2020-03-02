/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.合并排序的数组;

import java.util.Arrays;

public class Main {

    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i <m+n; i++) {
            A[i]=B[i-m];
        }
        Arrays.sort(A);
    }
}
