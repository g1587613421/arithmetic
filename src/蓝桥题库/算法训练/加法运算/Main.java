/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库.算法训练.加法运算;

import java.util.Scanner;

public class Main {
public static void main(String arg[]){//main--来自高金磊
    System.out.println(GetTwoInts());

}
    private static int GetTwoInts(){
     Scanner scanner=new Scanner(System.in);
     return scanner.nextInt()+scanner.nextInt();
    }
}
