/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.交换数字;

public class Main {
    public int[] swapNumbers(int[] numbers) {
        numbers[0]+=numbers[1];
        numbers[1]-=numbers[0];
        numbers[0]+=numbers[1];
        numbers[1]=-numbers[1];
        return numbers;
    }
}
