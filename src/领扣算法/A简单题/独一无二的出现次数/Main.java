/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.独一无二的出现次数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    HashMap<Integer,Integer> data=new HashMap<>();
    public boolean uniqueOccurrences(int[] arr) {
        for (int i : arr) {
            data.put(i, data.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> middle=new ArrayList<>(data.values());
        Collections.sort(middle);
        int pre=-1;
        for (Integer integer : middle) {
            if (pre==integer)
                return false;
            else pre=integer;
        }

        return true;

    }
}
