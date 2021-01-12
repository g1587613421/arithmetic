/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.旋转字符串;

import java.util.LinkedList;

public class Main {
    public boolean rotateString(String A, String B) {
//        char[] charsA=|A.toCharArray(),charsB=B.toCharArray();
        if (A.length()!=B.length())
            return false;
        if (A.length()==0)
            return true;
        LinkedList<Character> dataA=new LinkedList<>(),dataB=new LinkedList<>();
        for (char c : A.toCharArray()) {
            dataA.add(c);
        }
        for (char c : B.toCharArray()) {
            dataB.add(c);
        }
        char first=dataB.getFirst();
        for (int i = 0; i < dataA.size(); i++) {
            if (check(dataA, dataB))
                return true;
            dataA.addLast(dataA.pollFirst());
        }
        return false;
    }

    private boolean check(LinkedList<Character> dataA, LinkedList<Character> dataB) {
        LinkedList<Character> middleA=new LinkedList<>(dataA);
        LinkedList<Character> middleB=new LinkedList<>(dataB);
        while (!middleA.isEmpty())
        {
            if (middleA.pollFirst()!=middleB.pollFirst())
                return false;
        }
        return true;
    }
}
