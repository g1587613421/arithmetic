/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最小差值I;

public class Main {


    public int smallestRangeI(int[] A, int K) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i : A) {
            min=Math.min(i, min);
            max=Math.max(i, max);
        }
        return max-min-2*K>0?max-min-2*K:0;
    }
}
