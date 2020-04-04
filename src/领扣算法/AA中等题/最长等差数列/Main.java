/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最长等差数列;

import java.util.HashMap;

public class Main {

    public int longestArithSeqLength(int[] A) {
        if (A.length<=2)
            return A.length;
        HashMap<Integer,int[]> data=new HashMap<>();
        //1次数2当前最大值
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                int dif=A[i]-A[j];
                int[] middle=data.getOrDefault(dif, new int[]{2,A[i]});
                if (A[i]-dif==middle[1]) {
                    middle[0]++;
                    middle[1] = A[i];
                }
                data.put(dif, middle);

            }
        }
        int max=1;
        for (int[] value : data.values()) {
            max=Math.max(max, value[0]);
        }
        return max;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().longestArithSeqLength(new int[]{3,6,9,12,6});
    }
}
