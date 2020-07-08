/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.所有蚂蚁掉下来前的最后一刻;

import java.util.Arrays;

public class Main {

    public int getLastMoment(int n, int[] left, int[] right) {
        return Math.max(left.length<1?0:Arrays.stream(left).max().getAsInt(),right.length<1?0:n-Arrays.stream(right).min().getAsInt());
    }
}
