/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.最大递减子数组;

import java.util.Arrays;

public class Main {

    public static void main(String arg[]){//main--来自高金磊
//        int[] data=new int[]{-2,2,-3,4,-1,2,1,-5,3};
        int[] data=new int[]{1,2,3,4};
        int[][] middle=new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            middle[i][0]=data[i];
        }
        for (int i = 1; i < middle.length; i++) {
            for (int j = 1; j < middle[0].length; j++) {
                middle[i][j]=middle[i-1][j-1]+data[i];
            }
        }
        int res=data[0];
        for (int[] ints : middle) {
            res=Math.max(res, Arrays.stream(ints).max().getAsInt());
        }
        System.out.println(res);
    }
}
