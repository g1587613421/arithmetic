/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.两个字符串是否是变位词;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
    
         Scanner scanner=new Scanner(System.in);
         String s=scanner.next();
         String s1=scanner.next();
        HashMap<Character,Integer> data=new HashMap<>();
        for (char c : s.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        for (char c : s1.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0)-1);
        }
        for (Integer value : data.values()) {
            if (value!=0)
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
