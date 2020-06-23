/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.切割后面积最大的蛋糕;

import java.util.Arrays;

public class Main {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int hori=horizontalCuts[0];
        int vert=verticalCuts[0];
        for (int i = 1; i <horizontalCuts.length ; i++) {
            hori=Math.max(hori,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        hori=Math.max(hori,h-horizontalCuts[horizontalCuts.length-1]);
        for (int i = 1; i <verticalCuts.length ; i++) {
            vert=Math.max(verticalCuts[i]-verticalCuts[i-1],vert);
        }
        vert=Math.max(vert,w-verticalCuts[verticalCuts.length-1]);

        return (int) (((long)hori*vert)%(1000000007L));
    }
}
