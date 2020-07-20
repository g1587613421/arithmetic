/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.换酒问题;

public class Main {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles<numExchange)
            return numBottles;
        return numBottles-numBottles%numExchange+numWaterBottles(numBottles/numExchange+numBottles%numExchange, numExchange);
    }
}
