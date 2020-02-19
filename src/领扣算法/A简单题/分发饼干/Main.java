/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.分发饼干;

import java.util.Arrays;

public class Main {

    int count=0;
    int cake=0;
    int ch=0;
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i : g) {
            while (cake<s.length&&s[cake]<i) {
                cake++;
            }
            if (cake>=s.length)
                return count;
            count++;
            cake++;

        }
        return count;
    }
}
