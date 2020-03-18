/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.翻转图像;

public class Main {

    public int[][] flipAndInvertImage(int[][] A) {
        int middle;
        for (int[] ints : A) {
            for (int i = 0; i < ints.length/2; i++) {
                middle=ints[i];
                ints[i]=(ints[ints.length-1-i]==1?0:1);
                ints[ints.length-1-i]=(middle==1?0:1);
            }
            if (ints.length%2==1)
            ints[ints.length/2]=(ints[ints.length/2]==1?0:1);

        }

        return A;
    }
}
