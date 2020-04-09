/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.分汤;

public class Main {
    Double[][] dp;
    public double soupServings(int n) {
        if (n >= 5551){
            return 1;
        }
        n = (int)Math.ceil(n / 25.0);
        dp = new Double[n + 1][n + 1];
        return solve(n, n);
    }

    private double solve(int a, int b) {
        if (a <= 0){
            if (b <= 0){
                return 0.5;
            }
            return 1;
        }
        if (b <= 0){
            return 0;
        }
        if (dp[a][b] != null){
            return dp[a][b];
        }
        double res = 0.25 * (solve(a - 4, b) + solve(a - 3, b - 1) + solve(a - 2, b - 2) + solve(a - 1, b - 3));
        return dp[a][b] = res;
    }
}
