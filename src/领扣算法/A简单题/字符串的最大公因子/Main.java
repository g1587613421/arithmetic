/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字符串的最大公因子;

public class Main {

    public String gcdOfStrings(String str1, String str2) {
        int size=Math.min(str1.length(), str2.length())+1;
        String ss;
        for (int i = size; i>0 ; i--) {
            ss=str1.substring(0,i);
            if (str1.replaceAll(ss, "").length()==0&&str2.replaceAll(ss, "").length()==0){
                return ss;
            }
        }
return "";
    }
}
