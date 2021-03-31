/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.早餐组合;

import java.util.Arrays;

public class Main {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        long res=0L;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int money=0;
        int j=drinks.length-1;
        for (int i : staple) {
            //可用二分法查找
            while (j>=0&&drinks[j]>x-i)
                j--;
            res+=j+1;
            res%=1000000007;
        }
        return (int) res;
    }
}
