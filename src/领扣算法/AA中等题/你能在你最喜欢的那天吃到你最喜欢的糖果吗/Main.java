/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.你能在你最喜欢的那天吃到你最喜欢的糖果吗;

public class Main {

    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        boolean res[]=new boolean[queries.length];
        long[][] data=new long[candiesCount.length][2];
        data[0][1]=candiesCount[0];
        for (int i = 1; i < data.length; i++) {
            //前开后闭
            data[i][0]=data[i-1][1];
            data[i][1]=data[i][0]+candiesCount[i];
        }
        for (int i = 0; i < queries.length; i++) {
            //在吃这个的时候吃的糖果数量
            long min=queries[i][1]+1;
            long max=(long)(queries[i][1]+1)*queries[i][2];
            //判断第min到max之间的糖果有没有符合的
            long min_can=data[queries[i][0]][0]+1;
            long max_can=data[queries[i][0]][1];
            if (min>max_can||max<min_can)
            {
                res[i]=false;
            }
            else res[i]=true;
        }
        return res;
    }
    public static void main(String arg[]) {//main--来自高金磊

        int  mm[]=new int[]{5215,14414,67303,93431,44959,34974,22935,64205,28863,3436,45640,34940,38519,5705,14594,30510,4418,87954,8423,65872,79062,83736,47851,64523,15639,19173,88996,97578,1106,17767,63298,8620,67281,76666,50386,97303,26476,95239,21967,31606,3943,33752,29634,35981,42216,88584,2774,3839,81067,59193,225,8289,9295,9268,4762,2276,7641,3542,3415,1372,5538,878,5051,7631,1394,5372,2384,2050,6766,3616,7181,7605,3718,8498,7065,1369,1967,2781,7598,6562,7150,8132,1276,6656,1868,8584,9442,8762,6210,6963,4068,1605,2780,556,6825,4961,4041,4923,8660,4114};
        new Main().canEat(mm, new int[][]{{91,244597,840227137}});
//        int sum=0;
//        for (int i = 0; i < 33; i++) {
//            sum+=mm[i];
//        }
//        System.out.println(sum);
    }
}
