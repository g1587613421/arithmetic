/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.石子游戏;

import java.util.Arrays;

public class Main {

    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        for (int i = 1; i < piles.length; i++) {
            piles[i]=piles[i]+i%2==0?piles[i-1]:-piles[i-1];
        }
        return piles[piles.length-1]<0;
    }
}
