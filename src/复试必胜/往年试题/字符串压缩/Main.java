/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.字符串压缩;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);
         String s=scanner.next();
         if (s.length()<2)
         {
             System.out.println(s);
             return;
         }
         char middle=' ';
         int sum=0;
         StringBuilder stringBuilder=new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sum==0)
            {
                middle=c;
                sum++;
            }
            else {
                if (c==middle)
                {
                    sum++;
                }
                else {
                    stringBuilder.append(sum<2?"":sum);
                    stringBuilder.append(middle);
                    middle=c;
                    sum=1;
                }
            }
        }
        stringBuilder.append(sum<2?"":sum);
        stringBuilder.append(middle);
        System.out.println(stringBuilder.toString());
    }
}
