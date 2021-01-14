/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.亲密字符串;

import java.util.HashSet;

public class Main {
    public boolean buddyStrings(String A, String B) {
        if (A.length()!=B.length())
            return false;
        char[] charsA=A.toCharArray(),charsB=B.toCharArray();
        HashSet<Character> charactersA=new HashSet<>(),charactersB=new HashSet<>();
        int count=0;
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i]!=charsB[i]){
                count++;
                charactersA.add(charsA[i]);
                charactersB.add(charsB[i]);
            }
        }
        if (count!=2)
            return false;
        for (Character character : charactersA) {
            if (!charactersB.contains(character))
                return false;
        }
        return true;
    }
}
