/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.移动石子直到连续;

import java.util.Arrays;

public class Main {

    public int[] numMovesStones(int a, int b, int c) {
        int d;
        int[] middle = new int[]{a, b, c};
        Arrays.sort(middle);
        a=middle[0];
        b=middle[1];
        c=middle[2];
        a=b-a;
        b=c-b;
        c=Math.min(a, b);
        d=Math.max(a, b);
        if (c==2)
            return new int[]{1,d+c-2};
        if (c==1)
            return new int[]{d!=1?1:0,d+c-2};
        return new int[]{2,d+c-2};


    }
}
