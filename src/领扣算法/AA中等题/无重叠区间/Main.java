/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.无重叠区间;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] >= right) {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }
    public static void main(String arg[]){//main--来自高金磊

       System.out.println(new Main().eraseOverlapIntervals(new int[][]{{1,2},{2,3}, {3,4}, {1,3}}));
    }
}
