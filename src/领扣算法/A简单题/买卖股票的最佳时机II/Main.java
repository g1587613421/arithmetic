/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.买卖股票的最佳时机II;

public class Main {

    public int maxProfit(int[] prices) {
        if (prices.length<2)
            return 0;
        int[][] data=new int[prices.length][2];
        data[0][0]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            data[i][0]=Math.max(data[i-1][0],data[i-1][1]-prices[i]);
            data[i][1]=Math.max(data[i-1][1],data[i-1][0]+prices[i]);

        }
        return Math.max(data[data.length-1][0],data[data.length-1][1]);
    }
}
