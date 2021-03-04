/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.N以内的所有素数;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊

        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        //DP
        boolean flag[]=new boolean[N+1];
        flag[0]=true;//0排除
        for (int i = 2; i < N; i++) {
            int middle=0;
            if (!flag[i])
            for (int j = 2; j*i <=N ; flag[i*j++]=true) ;
        }
        for (int i = 1; i < flag.length; i++) {
            if (!flag[i])
                System.out.println(i);
        }
        }
}
