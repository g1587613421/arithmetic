/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.按奇偶排序数组;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int[] sortArrayByParity(int[] A) {

        Integer[] data = new Integer[A.length];
        for (int i = 0; i < data.length; i++) {
            data[i]=A[i];
        }
        Arrays.sort(data,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2%2-o1%2;
            }
        });
        for (int i = 0; i < A.length; i++) {
            A[i]=data[i];
        }
        return A;
    }

    public int[] sortArrayByParitys(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }

}
