/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.按奇偶排序数组II;

import java.util.Arrays;

public class Main {

    public int[] sortArrayByParityII(int[] A) {
        Arrays.sort(A);
        int middle[]=new int[A.length];
        int odd_number=1;
        int even=0;
        for (int i : A) {
            if (i%2==0)
            {
                middle[(even++)*2]=i;
            }
            else {
                middle[odd_number]=i;
                odd_number+=2;
            }
        }

        return middle;
    }
}
