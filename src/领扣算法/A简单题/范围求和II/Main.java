/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.范围求和II;

public class Main {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0)
            return m*n;
        int count=0,max=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int size=0;
                for (int[] op : ops) {
                    if (i<op[0]&&j<op[1]){
                        size++;
                    }
                }
                if (size>=max){
                    max=size;
                    count++;
                }
                else break;

            }

        }
        return count;
    }

    //内存溢出
//    public int maxCount(int m, int n, int[][] ops) {
//        int[][] nums = new int[m][n];
//        for (int[] op : ops) {
//            for (int i = 0; i < op[0]; i++) {
//                for (int j = 0; j < op[1]; j++) {
//                    nums[i][j]++;
//                }
//            }
//        }
//        int count=0;
//        for (int[] num : nums) {
//            for (int i : num) {
//                if (i==nums[0][0])
//                    count++;
//                else break;
//            }
//        }
//
//
//        return count;
//    }
}
