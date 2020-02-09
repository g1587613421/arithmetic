/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字符串中的单词数;

public class Main {
    private int countSegments(String s) {
        String[] strings=s.split(" ");
        int count=0;
        for (String string : strings) {
            if (string.equals("")||string.equals(" "))
                continue;
            count++;
        }
        return count;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.print(new Main().countSegments(", , , ,        a, eaefa"));
    }
}
