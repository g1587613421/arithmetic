/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.分割两个字符串得到回文串;

public class Main {
    public boolean checkPalindromeFormation(String a, String b) {
       return plus(a, b)||plus(b, a);
    }
    public boolean plus(String a,String b){
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int max_size=0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i]==chars2[chars1.length-1-i]){
                max_size++;
            }
            else
                break;

        }
        StringBuffer mm;
        for (int i = 0; i < max_size+1; i++) {
            mm=new StringBuffer();
            for (int j = 0; j < i; j++) {
                mm.append(chars1[i]);
            }
            for (int j = i; j <chars1.length ; j++) {
                mm.append(chars2[j]);
            }
            if (mm.toString().equals(mm.reverse().toString()))
                return true;
        }
        return false;
    }

}
