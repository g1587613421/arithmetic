/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AAA困难.直方图的水量;

public class Main {
    public int trap(int[] height) {
        int middle[][]=new int[height.length][2];
        int max=0;
        for (int i = 0; i < height.length; i++) {
            max=Math.max(max, height[i]);
            middle[i][0]=max;
        }
        max=0;
        for (int i = height.length-1; i >=0; i--) {

            max=Math.max(max, height[i]);
            middle[i][1]=max;
        }
        int count=0;
        for (int i = 0; i < height.length; i++) {
            count+=Math.min(middle[i][0],middle[i][1])-height[i];
        }
        return count;
    }
}
