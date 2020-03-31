/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.判定字符是否唯一;

import java.util.HashSet;

public class Main {

    public boolean isUnique(String astr) {
        HashSet<Character> res=new HashSet<>();
        for(char c : astr.toCharArray()){
            res.add(c);
        }
        return astr.length()==res.size();
    }
}
