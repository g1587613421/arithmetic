/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.三角形的最大周长;

import java.util.Arrays;

public class Main {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i>=2 ; i++) {
            int a=A[i];
            int b=A[i-1];
            int c=A[i-2];
            if (a+b>c&&a+c>b&&b+c>a){
                return a+b+c;
            }
        }
        return 0;
    }
}
