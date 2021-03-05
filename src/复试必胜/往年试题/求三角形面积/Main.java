/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.求三角形面积;

import java.util.Scanner;

public class Main {
    
    public static void main(String arg[]){//main--来自高金磊

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int M=(a+b+c)/2;
        if (a+b<=c||a+c<=b||c+b<=a)
        {
            System.out.println("不是三角形");
            return;
        }
        System.out.println(Math.pow(M*(M-a)*(M-b)*(M-c), 0.5));
    }
}
