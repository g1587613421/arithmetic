/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.不同路径;

public class Main {

    public int uniquePaths(int m, int n) {
        int[][] data=new int[m+1][n+1];
        data[0][1]=1;
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[0].length; j++) {
              data[i][j]=data[i][j-1]+data[i-1][j];
            }

        }
        return data[data.length-1][data[0].length-1];
    }

//着虽然是一道组合题但是会越界--使用大整数效率太低--35%,5%;

//    public int uniquePaths(int m, int n) {
//        m--;
//        n--;
//        BigInteger res= BigInteger.valueOf(1);
//        for (int i = m+n; i>m; i--) {
//            res=res.multiply(BigInteger.valueOf(i));
//        }
//        for (int i = n; i> 0; i--) {
//            res= res.divide(BigInteger.valueOf(i));
//        }
//
//        return res.intValue();
//    }
}
