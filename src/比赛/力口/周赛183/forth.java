/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛183;

public class forth {
    private int[] sums;
    private int range(int i, int j) {
        if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i-1];
        }
    }

    public String stoneGameIII(int[] stoneValue) {
        int len = stoneValue.length;
        sums = new int[len];
        sums[0] = stoneValue[0];
        for(int i = 1; i < len; i++) {
            sums[i] += (sums[i-1] + stoneValue[i]);
        }

        int[][] dp = new int[len + 1][len + 1];
        for(int i = len - 1; i >= 0; i--) {
            for(int j = len; j >= 1; j--) {
                int max = 0;
                int k = i;
                while(k < len && k - i + 1 <= 2 * j) {
                    int m = 3;
                    max = Math.max(max, range(i, len - 1) - dp[k+1][m]);
                    k++;
                }
                dp[i][j] = max;
            }
        }
        return ""+dp[0][1];
    }

}
