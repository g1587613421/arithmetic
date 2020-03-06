/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.删除最外层的括号;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public String removeOuterParentheses(String S) {
        LinkedList<Integer> data=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        char[] cs=S.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i]=='(')
            {
                stack.push(i);
            }
            else
            {
               if (stack.size()==1)
               {
                   data.add(i);
                   data.add(stack.pop());
               }else
                   stack.pop();
            }
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < cs.length; i++) {
            if (!data.contains(i))
                stringBuffer.append(cs[i]);
        }
        return stringBuffer.toString();
    }
}
