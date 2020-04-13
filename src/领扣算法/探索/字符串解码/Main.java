/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.字符串解码;

import java.util.LinkedList;

public class Main {
    public String decodeString(String s) {
        //初始化
        LinkedList<Integer> numStack = new LinkedList();
        LinkedList<String> strStack = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else if (c == '[') {
                if (num > 0) numStack.push(num);
                strStack.push(sb.toString());
                sb = new StringBuilder();
                num = 0;
            } else {
                //c==']'
                StringBuilder preSB = new StringBuilder().append(strStack.pop());
                int times = numStack.pop();
                for (int j = 0; j < times; j++) {
                    preSB.append(sb);
                }
                sb = preSB;
            }
        }
        return sb.toString();
    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().decodeString("3[a]2[bc]");
    }
}
