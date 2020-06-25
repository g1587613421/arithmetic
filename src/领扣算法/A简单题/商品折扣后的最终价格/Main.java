/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.商品折扣后的最终价格;

public class Main {

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]<=prices[i]){
                    prices[i]-=prices[j];
                    break;
                }

            }
        }
        return prices;
    }
}
