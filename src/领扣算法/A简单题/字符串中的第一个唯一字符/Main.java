/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字符串中的第一个唯一字符;

public class Main {

    public int firstUniqChar(String s) {
        char[] data=s.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (s.indexOf(data[i])==s.lastIndexOf(data[i]))
                return i;
        }
        return -1;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().firstUniqChar("cc"));
    }
}
