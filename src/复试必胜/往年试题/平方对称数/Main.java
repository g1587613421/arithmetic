/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.平方对称数;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        //1000内的
        StringBuilder stringBuilder1;
        for (int i = 0; i < 1000; i++) {
            stringBuilder1 = new StringBuilder();
            int num=i*i;
            for (char c : ("" + num).toCharArray()) {
                stringBuilder1.append(c);
            }
            if (stringBuilder1.toString().equals(stringBuilder1.reverse().toString()))
                System.out.println(i);
        }
    }
}
