/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最近的请求次数;

import java.util.ArrayList;

public class RecentCounter {
    ArrayList<Integer> data,middle;

    public RecentCounter() {
        data = new ArrayList<>();
        middle=new ArrayList<>();
    }

    public int ping(int t) {
        middle.clear();
        data.add(t);
        for (Integer datum : data) {
            if (t-datum>3000){
                middle.add(datum);
            }
        }
        data.removeAll(middle);
        return data.size();
    }
}
