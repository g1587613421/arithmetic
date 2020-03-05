/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最后一块石头的重量;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public int lastStoneWeight(int[] stones) {
        LinkedList<Integer> data=new LinkedList<>();
        for (int stone : stones) {
            data.add(stone);
        }
        int middle;

        while (data.size()>1){
            Collections.sort(data);
            middle=Math.abs(data.pollLast()-data.pollLast());
            if (middle>0)
                data.add(middle);
        }
        if (data.isEmpty())
            return 0;
        else return data.pollLast();
    }
}
