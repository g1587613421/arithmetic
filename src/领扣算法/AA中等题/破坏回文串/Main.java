/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.破坏回文串;

public class Main {

    public String breakPalindrome(String palindrome) {
        if (palindrome.length()<2)
            return "";
        StringBuffer stringBuffer;
        char middle;
        for (int i = 0; i < palindrome.length(); i++) {
            middle=palindrome.charAt(i);
            for (int j = 0; j < middle-'a'; j++) {
                stringBuffer=new StringBuffer(palindrome);
                stringBuffer.replace(i, i+1, ""+(char)('a'+j));
                if (!stringBuffer.toString().equals(stringBuffer.reverse().toString()))
                    return stringBuffer.reverse().toString();
            }

        }
        stringBuffer=new StringBuffer(palindrome);
        return stringBuffer.replace(stringBuffer.length()-1, stringBuffer.length(), ""+(char)(stringBuffer.charAt(stringBuffer.length()-1)+1)).toString();
    }
}
