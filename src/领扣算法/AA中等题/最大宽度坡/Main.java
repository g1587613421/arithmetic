/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最大宽度坡;

public class Main {

    public int maxWidthRamp(int[] A) {
        int max_w=0;
        for (int i = 0; i < A.length; i++) {
            for (int j =A.length-1; j>max_w+i ; j--) {
                if (A[j]>=A[i]){
                    max_w=j-i;
                    break;
                }
            }

        }
        return max_w;
    }
}
