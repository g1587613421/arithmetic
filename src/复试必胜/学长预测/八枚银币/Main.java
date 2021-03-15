/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.八枚银币;

public class Main {

    public static void main(String arg[]){//main--来自高金磊
        for (int i = 100; i < 1000; i++) {
            int a=i%10;
            int b=i%100/10;
            int c=i/100;
            if (a*a*a+b*b*b+c*c*c==i)
                System.out.println(i);
        }
    }
}
