/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.字符串的排列;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    HashSet<String> data=new HashSet<>();
    HashSet<String> speed=new HashSet<>();//加速器
    char[] chars;
    public String[] permutation(String s) {
        chars=s.toCharArray();
        LinkedList<Integer> middle=new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            middle.addLast(i);
        }
        plus(middle, new StringBuilder(), chars.length);
        String[] res=new String[data.size()];
        int count=0;
        for (String datum : data) {
            res[count++]=datum;
        }
        return res;
    }
    void plus(LinkedList<Integer> flag, StringBuilder stringBuilder, int n){
        if (n==0)
        {
            data.add(stringBuilder.toString());
            return;
        }
        if (speed.contains(stringBuilder.toString()))
            return;
        speed.add(stringBuilder.toString());
        for (Integer integer : flag) {
            StringBuilder builder=new StringBuilder(stringBuilder);
            builder.append(chars[integer]);
            LinkedList<Integer> middle=new LinkedList<>(flag);
            middle.remove(integer);
            plus(middle,builder,n-1);
        }
    }
}
