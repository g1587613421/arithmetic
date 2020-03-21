/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.不同的二叉搜索树;

public class Main {
    int[] data;
    public int numTrees(int n) {
        if (n<2)
            return 1;
        data=new int[n+1];
        data[0]=1;
        data[1]=1;
        data[2]=2;
        return plus(n);
    }
    int plus(int n){
       int mm=0;
       if (data[n]!=0)
           return data[n];
        for (int i = 1; i <=n; i++) {
            mm+=(data[i-1]==0?plus(i-1):data[i-1])*(data[n-i]==0?plus(n-i):data[n-i]);
        }
        data[n]=mm;
        return data[n];
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        System.out.println(new Main().numTrees(5));
    }
}
