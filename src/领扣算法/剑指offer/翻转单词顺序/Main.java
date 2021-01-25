/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.翻转单词顺序;

public class Main {
    public String reverseWords(String s) {
        String[] data=s.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = data.length-1; i >=0; i--) {
            if (data[i].equals(" ")||data[i].equals(""))
                continue;
            stringBuffer.append(data[i]);
            stringBuffer.append(" ");
        }
        while (stringBuffer.toString().endsWith(" ")){
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
        return stringBuffer.toString();
//        return stringBuffer.append(data[0].equals(" ")?"":data[0]).toString();
    }
}
