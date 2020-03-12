/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.翻转矩阵后的得分;


//方法正确但是代码执行效率不高
//执行用时 :
//8 ms
//, 在所有 Java 提交中击败了
//5.31%
//的用户
//内存消耗 :
//38.4 MB
//, 在所有 Java 提交中击败了
//17.81%
//的用户
public class Main {

    public int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][0]==0){
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j]=1-A[i][j];
                }
            }
        }
        int cc;
        for (int i = 1; i <A[0].length ; i++) {

            cc = 0;
            for (int j = 0; j < A.length; j++) {
                cc+=A[j][i];
            }
            System.out.println(cc);
            if (cc<A.length-cc){
                for (int j = 0; j < A.length; j++) {
                    A[j][i]=-A[j][i]+1;
                }
            }
        }
        cc=0;
        StringBuffer middle;

        for (int i = 0; i < A.length; i++) {
            middle = new StringBuffer();
            for (int j = 0; j < A[0].length; j++) {
                middle.append(A[i][j]);
            }
            System.out.println(middle);
            cc+=Integer.parseInt(middle.toString(), 2);
        }
        return cc;
    }
    
    public static void main(String[] arg){//main--来自高金磊
    new Main().matrixScore(new int[][]{{0,1},{0,1},{0,1},{0,0}});

    }
}
