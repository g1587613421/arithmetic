/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.比较字符;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    //比较两个字符串A和B,确定A中是否包含B中所有的字符。
    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);
         String A=scanner.next();
         String B=scanner.next();
        HashSet<Character> dataA=new HashSet<>();
        for (char c : A.toCharArray()) {
            dataA.add(c);
        }
        for (char c : B.toCharArray()) {
            if (!dataA.contains(c))
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
