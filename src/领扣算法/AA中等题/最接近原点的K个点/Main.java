/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最接近原点的K个点;

import java.util.Arrays;

public class Main {

    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points,(a,b)->((a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])));
        return Arrays.copyOf(points, K);
    }
}
