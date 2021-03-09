/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.大数相加;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        //0   100
        //0 0
        //150 150
         Scanner scanner=new Scanner(System.in);
         char[] num1=scanner.next().toCharArray();
         char[] num2=scanner.next().toCharArray();
        LinkedList<Character> characters1=new LinkedList<>();
        for (char c : num1) {
            characters1.addLast(c);
        }
        LinkedList<Character> characters2=new LinkedList<>();
        for (char c : num2) {
            characters2.addLast(c);
        }
        StringBuilder stringBuilder=new StringBuilder();
        int mid=0;
        while (!(characters1.isEmpty()&&characters2.isEmpty())){
            if (!characters1.isEmpty())
                 mid+=characters1.pollLast()-'0';
            if (!characters2.isEmpty())
                 mid+=characters2.pollLast()-'0';
            stringBuilder.insert(0, mid%10);
            mid/=10;
        }
        if (mid!=0)
            stringBuilder.insert(0, mid);
        System.out.println(stringBuilder.toString());

        
        
    }
}
