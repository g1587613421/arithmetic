/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020;

import java.util.HashSet;
import java.util.LinkedList;

public class forth {
    public int minJump(int[] jump) {
        int max=0;
        HashSet<Integer> flags=new HashSet<>();
        LinkedList<Integer> data=new LinkedList<>(),middle=new LinkedList<>();
        int count=0;
        data.addFirst(jump[0]);
        flags.add(0);
        while (true) {
            middle.clear();
            for (Integer datum : data) {
                if (jump.length <= datum)
                    return count;
                middle.add(datum+jump[datum]);
                for (int i = max; i < datum; i++) {
                    if (!flags.contains(i)) {
                        middle.add(i);
                        flags.add(i);
                    }
                }
                max=Math.max(max, datum);
            }
            data.clear();
            data.addAll(middle);
            count++;
        }
    }
}
