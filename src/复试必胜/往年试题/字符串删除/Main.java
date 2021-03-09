/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.字符串删除;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        //ababababababababababa
        //aba
        //bbbbba
        //5
         Scanner scanner=new Scanner(System.in);
         String s1=scanner.next();
         String s2=scanner.next();
         int middle=s1.length();
         s1=s1.replaceAll(s2, "");
         System.out.println(s1);
         System.out.println((middle-s1.length())/s2.length());
    }
}
