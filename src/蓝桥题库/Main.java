/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库;

import java.util.Scanner;

public class Main {
    
    public static void main(String arg[]){//main--来自高金磊
         Scanner scanner=new Scanner(System.in);
         int n=scanner.nextInt();
         int m=scanner.nextInt();
         int p=scanner.nextInt();
         int[] data=new int[Math.max(m, n)];
         int[] sum=new int[data.length];
         data[0]=data[1]=1;
         sum[0]=1;
         sum[1]=2;
        for (int i = 2; i < data.length; i++) {
            data[i]=(data[i-1]+data[i-2])%p;
        }
        for (int i = 2; i < data.length; i++) {
            sum[i]=(data[i]+sum[i-1])%p;
        }
        
        System.out.println((sum[n-1]%p));
        
    }
}
