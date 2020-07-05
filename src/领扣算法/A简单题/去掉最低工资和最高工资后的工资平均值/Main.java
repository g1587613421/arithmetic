/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.去掉最低工资和最高工资后的工资平均值;

import java.util.Arrays;

public class Main {
    public double average(int[] salary) {
        return ((double) (Arrays.stream(salary).sum()-Arrays.stream(salary).max().getAsInt() - Arrays.stream(salary).min().getAsInt())/(Arrays.stream(salary).count()-2));
    }
}
