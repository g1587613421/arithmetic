/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.等价多米诺骨牌对的数量;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int numEquivDominoPairs(int[][] dominoes) {
        int middle;
        for (int i = 0; i < dominoes.length; i++) {
            if (dominoes[i][0]>dominoes[i][1])
            {
                middle=dominoes[i][0];
                dominoes[i][0]=dominoes[i][1];
                dominoes[i][1]=middle;
            }
        }
        Arrays.sort(dominoes,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                    return o1[1]-o2[1];
                else return o1[0]-o2[0];
            }
        });
        middle=1;
        int res=0;
        int[] arr = dominoes[0];
        for (int i = 1; i < dominoes.length; i++) {
            if (arr[0]==dominoes[i][0]&&arr[1]==dominoes[i][1]){
                middle++;
            }else {
                res+=(middle*(middle-1))/2;
                middle=1;
                arr=dominoes[i];
            }
        }
        return res+(middle*(middle-1))/2;

    }
}
