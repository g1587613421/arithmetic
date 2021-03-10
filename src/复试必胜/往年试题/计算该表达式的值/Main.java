/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.计算该表达式的值;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String arg[]){//main--来自高金磊
        //1 + 1 + 2 * 3 / 5
        //1 / 3 - 5 * 2 + 1 + 2 * 3 / 5
         Scanner scanner=new Scanner(System.in);
         String[] data=scanner.nextLine().split(" ");
        LinkedList<Double> num=new LinkedList<>();
        LinkedList<Character> flag=new LinkedList<>();
        //观察到数字符号是交替的
        for (int i = 0; i < data.length; i++) {
            if (i%2==0){
                num.addLast(Double.valueOf(data[i]));
            }
            else flag.add(data[i].charAt(0));
        }
        for (int i = flag.size(); i > 0; i--) {
            char middle=flag.pollFirst();
            double num1=num.pollFirst();
            double num2=num.pollFirst();
            switch (middle){
                case '*':
                    num1*=num2;
                    num.addFirst(num1);
                    break;
                case '/':
                    num1/=num2;
                    num.addFirst(num1);
                    break;
                default:{
                      num.addFirst(num2);  
                      num.addLast(num1);
                      flag.addLast(middle);
                }
            }
        }
        num.addLast(num.pollFirst());
        char middle;
        double num1=num.pollFirst();
       while (!flag.isEmpty()){
            middle = flag.pollFirst();
            switch (middle){
                case '+':
                    num1+=num.pollFirst();
                    break;
                case '-':
                    num1-=num.pollFirst();
            }
        }
        System.out.println(num1);
    }
}
