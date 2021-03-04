/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.字符串转置;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Stack<Character> middle= new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c==' '){
               while (!middle.isEmpty())
               {
                   stringBuilder.append(middle.pop());
               }
               stringBuilder.append(' ');
            }
            else {
                middle.push(c);
            }
        }
        while (!middle.isEmpty())
        {
            stringBuilder.append(middle.pop());
        }
        System.out.println(stringBuilder.toString());
        //to be or not to be
        //
        //to

    }
}
