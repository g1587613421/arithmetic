/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.计算力扣银行的钱;

public class Main {
    public int totalMoney(int n) {
        int res=0;int num=0;
        while (n-->0){

            res+=1+num%7+num/7;
            num++;
        }
        return res;
    }
    public static void main(String arg[]){//main--来自高金磊
        new Main().totalMoney(8);
    }
}
