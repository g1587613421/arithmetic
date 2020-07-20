/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.子树中标签相同的节点数;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        //数据初始化
        HashSet<Integer> G=new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            if (G.contains(edges[i][1])){
                int middle=edges[i][0];
                edges[i][0]=edges[i][1];
                edges[i][1]=middle;
            }
            G.add(edges[i][1]);//标记已经添加到树上的点
        }
        char cs[]=labels.toCharArray();
        char Gcs[]=new char[n];
        //构造顶点元素集合
        Gcs[0]=cs[0];
        for (int i = 0; i < edges.length; i++) {//n-1个边
            Gcs[edges[i][1]]=cs[i+1];
        }
        //构造直属子集关系
        HashSet<Integer>[] data=new HashSet[n];
        for (int i = 0; i < data.length; i++) {
            data[i]=new HashSet<>();
        }
        for (int i = 0; i < edges.length; i++) {
            data[edges[i][0]].add(edges[i][1]);
        }
        //扩充完全的子集关系
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i = 0; i < data.length; i++) {
                HashSet<Integer> middle=new HashSet<>(data[i]);
                for (Integer datum : data[i]) {
                    if (!middle.containsAll(data[datum])){
                        flag=true;
                        middle.addAll(data[datum]);
                    }
                }
                data[i]=middle;
            }
        }
        //导出结果
        int[] res=new int[n];
        Arrays.fill(res, 1);
        for (int i = 0; i < res.length; i++) {
            int count=0;
            for (Integer integer : data[i]) {
                if (Gcs[integer]==Gcs[i])
                    count++;
            }
            res[i]+=count;
        }
        return res;

    }

    public static void main(String arg[]){//main--来自高金磊

        new Main().countSubTrees(4,new int[][]{{0,2},{0,3},{1,2}},"aeed");
    }
}
