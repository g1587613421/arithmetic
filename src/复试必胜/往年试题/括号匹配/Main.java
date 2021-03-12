/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.括号匹配;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);
         String s = scanner.next();
         int sum=0;
        for (char c : s.toCharArray()) {
            switch (c){
                case '(':
                    sum++;
                    break;
                case ')':
                    sum--;
                    if (sum<0)
                    {
                        System.out.println(false);
                        return;
                    }
                    break;
            }
        }
        System.out.println(sum==0);
    }
}
