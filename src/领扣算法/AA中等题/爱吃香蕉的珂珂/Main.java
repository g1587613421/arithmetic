/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.爱吃香蕉的珂珂;

import java.util.Arrays;

public class Main {
    public int minEatingSpeed(int[] piles, int H) {
        if (H==piles.length)
            return Arrays.stream(piles).max().getAsInt();
        long sum=0;
        for (int pile : piles) {
            sum+=pile;
        }
        int middle=(int) (sum/H);
        if (middle<0)
            middle=Integer.MAX_VALUE/H;
        if (middle==0)
            middle++;
        while (true)
        {
            //尝试用middle
            int day=0;
            for (int pile : piles) {
                day+=pile%middle==0?0:1;
                day+=pile/middle;
                if (day>H+1)
                    break;
            }
            if (day<=H)
                return middle;
            middle++;

        }
    }
    public static void main(String arg[]){//main--来自高金磊

        new Main().minEatingSpeed(new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184}, 823855818);
    }
}
