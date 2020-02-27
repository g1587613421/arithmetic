/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库.基础练习.十六进制转八进制;

import java.util.Scanner;

public class Main {
    
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();
        String result[]=new String[sum];
        for (int i = 0; i < sum; i++) {
            
            result[i]=Long.toString(Long.parseLong(""+scanner.next(), 16),8);

        }
        for (String s : result) {
            System.out.println(s);
        }

    }
}
