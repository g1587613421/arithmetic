/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.高度检查器;

import java.util.Arrays;

public class Main {

    public int heightChecker(int[] heights) {
        int h[]=new int[heights.length];
        for (int i = 0; i < h.length; i++) {
            h[i]=heights[i];
        }
        Arrays.sort(h);
        int count=0;
        for (int i = 0; i < h.length; i++) {
            if (h[i]!=heights[i])
                count++;
        }
        return count;
    }
}
