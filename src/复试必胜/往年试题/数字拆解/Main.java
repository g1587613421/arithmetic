/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.数字拆解;

public class Main {
    public static void main(String arg[]) {//main--来自高金磊
//https://www.cnblogs.com/libra-yong/p/6360181.html
        int target = 3;
        //递归
        System.out.println(plus(target,0));
    }

    private static int plus(int i, int i1) {
        if (i1>i)
            return 0;
        if (i1==i)
            return 1;
        return plus(i-1, i1+1)+1;

    }
}
