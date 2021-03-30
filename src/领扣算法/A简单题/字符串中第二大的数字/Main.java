/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.字符串中第二大的数字;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public int secondHighest(String s) {
        char[] data=s.toCharArray();
        HashSet<Integer> middle=new HashSet<>();
        for (char datum : data) {
            if (datum<'0'||datum>'9')
                continue;
            middle.add(datum-'0');
        }
        LinkedList<Integer> res=new LinkedList<>();
        for (Integer integer : middle) {
            res.add(integer);
        }
        if (res.size()<2)
            return -1;
        Collections.sort(res);
        res.pollLast();
        return res.pollLast();
    }
}
