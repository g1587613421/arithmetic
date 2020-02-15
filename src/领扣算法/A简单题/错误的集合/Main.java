/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.错误的集合;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int[] findErrorNums(int[] nums) {
        Map< Integer, Integer > map = new HashMap();
        int dup = -1, missing = 1;
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
    }
}
