/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.掷骰子模拟;

import java.util.Arrays;

public class Main {

    public int dieSimulator(int n, int[] rollMax) {
        int[][] data = new int[n][6];
        Arrays.fill(data[0], 1);
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (rollMax[j]<i){
                    data[i][j]=Arrays.stream(data[i-1]).sum()-data[i-rollMax[j]][j]+data[i-rollMax[j]-1][j];
                }
                else data[i][j]=Arrays.stream(data[i-1]).sum();
            }

        }
        return Arrays.stream(data[data.length-1]).sum();
    }
}
