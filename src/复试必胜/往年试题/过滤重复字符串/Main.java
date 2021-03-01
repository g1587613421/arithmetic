/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.过滤重复字符串;

public class Main {
    // 去除字符串中相邻重复的字符。
    private String remove_repeat_char(String s){
        char data[]=s.toCharArray();
        if (data.length==0)
            return "";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(data[0]);
        char middle=data[0];
        for (int i = 1; i < data.length; i++) {
            if (middle==data[i])
                continue;
            middle=data[i];
            stringBuilder.append(middle);
        }
        return stringBuilder.toString();
    }

    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().remove_repeat_char("afgdgugauigsuiiiiisss"));
        System.out.println(new Main().remove_repeat_char("aa"));
        System.out.println(new Main().remove_repeat_char(""));
    }
}
