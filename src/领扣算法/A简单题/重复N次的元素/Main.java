/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.重复N次的元素;

import java.util.ArrayList;

public class Main {

    public int repeatedNTimes(int[] A) {
        ArrayList<Integer> data=new ArrayList<>();
        for (int i : A) {
            if (data.contains(i))
                return i;
            else data.add(i);
        }
        return -1;
    }
}
