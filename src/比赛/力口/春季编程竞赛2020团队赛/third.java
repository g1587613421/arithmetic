/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020团队赛;

import java.util.Arrays;

public class third {

    public int minimalSteps(String[] maze) {
        char[][] data=new char[maze.length][];
        for (int i = 0; i < maze.length; i++) {
            data[i]=maze[i].toCharArray();
        }
        int[][] middle=new int[data.length][data[0].length];
        for (int[] ints : middle) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        boolean b=true;
        while (b){
            b=false;
            for (int i = 0; i < data.length; i++) {
                for (int j  = 0; j <data[0].length ; j++) {
                    int mm=middle[i][j];
                    if (data[i][j]!='O');
                }

            }
        }


return 0;
    }
}
