/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.完数;

public class Main {
    public static void main(String arg[]){//main--来自高金磊

        for (int i = 2; i < 1000; i++) {
            long middle=1;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    middle+=j;
                }
            }
            if (middle==i)
                System.out.println(middle);
        }
    }
}
