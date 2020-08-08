/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.连续字符;

public class Main {
    public int maxPower(String s) {
        char c='z'+1;
        int count=0;
        int max=0;
        for (char c1 : s.toCharArray()) {
            if (c==c1)
                count++;
            else {
                max=Math.max(max, count);
                c=c1;
                count=1;
            }
        }
        return Math.max(count, max);
    }
}
