/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.供暖器;

public class Main {
    int max=0;
    public int findRadius(int[] houses, int[] heaters) {
        max=Math.max(houses[houses.length-1]-heaters[heaters.length-1], heaters[0]-houses[0]);
        for (int i = 1; i < heaters.length; i++) {
                max=Math.max((int) Math.ceil(( heaters[i]-heaters[i-1]-1)/2d),max);
        }
        return max;
    }
}
