/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库.基础练习.数列排序;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int num[]=new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i]=scanner.nextInt();
        }
        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i+" ");
        }
    }

}
