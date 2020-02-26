/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.计数二进制子串;

public class Main {
        public int countBinarySubstrings(String s) {
            int ans = 0, prev = 0, cur = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i-1) != s.charAt(i)) {
                    ans += Math.min(prev, cur);
                    prev = cur;
                    cur = 1;
                } else {
                    cur++;
                }
            }
            return ans + Math.min(prev, cur);

    }

    public static void main(String arg[]){//main--来自高金磊

    }
}
