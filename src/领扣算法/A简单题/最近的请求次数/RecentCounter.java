/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最近的请求次数;

import java.util.ArrayList;

public class RecentCounter {
    ArrayList<Integer> data;

    public RecentCounter() {
        data = new ArrayList<>();

    }

    public int ping(int t) {
        data.add(t);
        while (t-data.get(0)>3000){
            data.remove(0);
        }

        return data.size();
    }
}
