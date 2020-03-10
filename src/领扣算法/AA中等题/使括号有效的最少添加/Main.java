/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.使括号有效的最少添加;

import java.util.Stack;

public class Main {

    public int minAddToMakeValid(String S) {
        Stack<Character> data=new Stack<>();
        int count=0;
        for (Character character : S.toCharArray()) {
            if (character=='(')
                data.push('(');
            else{
                if (data.isEmpty())
                    count++;
                else if (data.peek()!='(')
                {
                    count++;
                }
                else data.pop();
            }

        }
        return count+data.size();
    }
}
