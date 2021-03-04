/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.星号排版;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**  eg13
     * 1 2 3 4 5 6 * 8 9 0 1 2 3 5 4                 7
     * 1 2 3 4 5 * 7 * 9 0 1 2 3 5 4                 6   8
     * 1 2 3 4 * 6 * 8 * 0 1 2 3 5 4                 5 7 9
     * 1 2 3 * 5 * 7 * 9 0 1 2 3 5 4
     * 1 2 3 4 5 6 7 8 9 0 1 2 3 5 4
     */
    public static void main(String arg[]){//main--来自高金磊
        int n=new Scanner(System.in).nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((j+i)%2==0)
//                    System.out.print('*');
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
        //函数计算法
        LinkedList<HashSet<Integer>> data=new LinkedList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add((n+1)/2);//第一行的星星
        data.addLast(hashSet);
        for (int i = 1; i < (n+1)/2; i++) {
            hashSet=new HashSet<>();
            for (Integer datum : data.peekLast()) {
                hashSet.add(datum-1);
                hashSet.add(datum+1);
            }
            data.addLast(hashSet);
        }
        for (HashSet<Integer> datum : data) {
            for (int i = 1; i < n+1; i++) {
                if (datum.contains(i))
                    System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
        data.pollLast();
        while (!data.isEmpty())
        {
            hashSet=data.pollLast();
            for (int i = 1; i < n+1; i++) {
                if (hashSet.contains(i))
                    System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
