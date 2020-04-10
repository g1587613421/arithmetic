/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.翻转字符串里的单词;

public class Main {

    public String reverseWords(String s) {
        String[] data=s.split(" ");
        if (data.length==0)
            return "";
        StringBuilder res=new StringBuilder();
        for (int i = data.length-1; i >0; i--) {
            if (!data[i].equals(""))
            res.append(data[i]).append(" ");
        }

        res.append(data[0]);
        if (res.toString().endsWith(" "))
            res.deleteCharAt(res.length()-1);
        return res.toString();
    }
//    public static void main(String arg[]){//main--来自高金磊
//
//        new Main().reverseWords("  hello world!  ");
//    }
}
