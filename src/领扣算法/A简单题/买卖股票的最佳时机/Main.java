/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.买卖股票的最佳时机;

public class Main {

    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for (int price : prices) {
            if (min>price)
            {
                min=price;
            }
            else {
                res=Math.max(res, price-min);
            }
        }
        return res;
    }
}
