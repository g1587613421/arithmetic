/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库.算法训练.数据交换;

import java.util.Scanner;

public class Main {
   static Integer b;
   static Integer a;
    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);

        a = scanner.nextInt();

        b = scanner.nextInt();
        swap();
         System.out.println(a+" "+b);

    }

     static void  swap(){
        Integer c=b;
        b=a;
        a=c;
    }
}
