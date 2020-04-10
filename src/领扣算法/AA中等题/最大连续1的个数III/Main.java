/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最大连续1的个数III;

public class Main {
    public int longestOnes(int[] A, int K) {
        int count=0;//记录0的数量
        if (A.length==0){
            return 0;
        }
        int pre=0,last=0;
        int max=0;
        count=A[pre]==0?1:0;
        while (last<A.length-1){
            if (count<=K)
            {
                last++;
                if (A[last]==0) {
                    count++;
                }
            }else {
                if (A[pre]==0)
                    count--;
                pre++;
            }
            if (count<=K)
            max=Math.max(max, last-pre+1);
        }
        if (count<=K)
            max=Math.max(max, last-pre+1);
        return max;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);
    }
}
