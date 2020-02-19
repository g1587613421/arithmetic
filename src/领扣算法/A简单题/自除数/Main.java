/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.自除数;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<Integer> result=new LinkedList<>();
    public List<Integer> selfDividingNumbers(int left, int right) {
        for (int i = left; i <=right; i++) {
            if (plus(i))
                result.add(i);

        }
        return result;
    }
    static String middle;
    private static boolean plus(int i) {
        middle=""+i;
        if(middle.contains("0"))
            return false;
        for (char c : middle.toCharArray()) {
            if (i%(c-'0')!=0)
                return false;
        }
        return true;
    }
}
