/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.上台阶;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        int num=new Scanner(System.in).nextInt();
        int data[]=new int[num<3?3:num];
        data[0]=1;
        data[1]=2;
        data[2]=4;
        for (int i = 3; i < data.length; i++) {
            data[i]=data[i-1]+data[i-2]+data[i-3];
        }
        System.out.println(data[data.length-1]);
    }
}
