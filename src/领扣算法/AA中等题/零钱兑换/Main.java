/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.零钱兑换;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    int min=Integer.MAX_VALUE;
    int[] coins;
    HashMap<Integer,Integer> logg=new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        if (amount==0)
            return 0;
        this.coins=coins;
      Arrays.sort(coins);
        for (int i = coins.length-1; i >=0; i--) {
            plus(i, amount-coins[i],1);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    void plus(int start,int amount,int count){
        if (count>=min||amount<0)
            return;
        if (logg.getOrDefault(amount, Integer.MAX_VALUE)<count)
            return;
        logg.put(amount, count);
        if (amount==0)
        {
            min=Math.min(min, count);
            return;
        }
        for (int i=start; i>=0 ; i--) {
            plus(i, amount-coins[i],count+1);
        }
    }
}
