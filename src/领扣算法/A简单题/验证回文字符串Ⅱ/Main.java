/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.验证回文字符串Ⅱ;

public class Main {

    public boolean validPalindrome(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return plus(s.substring(i,s.length()-i-1))||plus(s.substring(i+1,s.length()-i));
            }
        }

        return true;
    }
 boolean plus(String s){
     for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i)!=s.charAt(s.length()-i-1)){
             return false;
         }
     }
     return true;
 }

    //timeOut
//    public boolean validPalindrome(String s) {
//        int pre;
//        int las;
//        for (int i = 0; i < s.length(); i++) {
//            pre=0;
//            las=s.length()-1;
//            for (int j = 0; j < s.length(); j++) {
//                if (pre==i)
//                    pre++;
//                if (las==i)
//                    las--;
//                if (s.charAt(pre++)!=s.charAt(las--)){
//                    break;
//                }
//                if (pre>=las)
//                    return true;
//            }
//        }
//        return false;
//    }
}
