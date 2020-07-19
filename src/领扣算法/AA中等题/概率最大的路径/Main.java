/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.概率最大的路径;

public class Main {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double data[]=new double[n];
        data[start]=1d;
        //贪心算法
        boolean flag=true;
        double middle;
        while (flag){
            flag=false;
            for (int i = 0; i < edges.length; i++) {
                middle = data[edges[i][1]]*succProb[i];
                if (middle>data[edges[i][0]]){
                    data[edges[i][0]]=middle;
                    flag=true;
                    continue;//不能再回去把...............
                }
                middle=data[edges[i][0]]*succProb[i];
                if (middle>data[edges[i][1]]){
                    data[edges[i][1]]=middle;
                    flag=true;
                }
            }
        }
        return data[end];
    }




    public static void main(String arg[]){//main--来自高金磊

        new Main().maxProbability(3,new int[][]{{0,1},{1,2},{0,2}},new  double[]{0.5,0.5,0.2},0, 2);
    }
}
