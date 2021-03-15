/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.M元素取N个元素所形成的子集;

import java.util.LinkedList;

public class Main {
//    static int M=10,N=5;
    static int M=4,N=3;
    public static void main(String arg[]){//main--来自高金磊

        for (int i = 0; i < N + 1; i++) {//6开始就无解了
            //约定只能先后,这样节省很多内存
            LinkedList<Integer> res=new LinkedList<>();
            res.add(i);
            plus(res,i+1,1);
        }
    }

    private static void plus(LinkedList<Integer> res, int i, int i1) {
        if (i1==N)
        {
            for (Integer re : res) {
                System.out.print(re+"  ");
            }
            System.out.println();
            return;
        }
        if (i>=M)
            return;
        for (int j = i; j <M ; j++) {
            LinkedList<Integer> middle=new LinkedList<>(res);
            middle.add(j);
            plus(middle, j+1, i1+1);
        }
    }
}
