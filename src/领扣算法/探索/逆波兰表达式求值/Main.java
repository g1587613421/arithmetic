/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.逆波兰表达式求值;

import java.util.Stack;

public class Main {

    public int evalRPN(String[] tokens) {
        if (tokens.length==0)
            return 0;
        Stack<Integer> data=new Stack();
        for (String token : tokens) {
            int middle;
            switch (token){
                case "+":
                    middle=data.pop();
                    middle+=data.pop();
                    data.push(middle);
                    break;
                case "-":
                    middle=data.pop();
                    middle=data.pop()-middle;
                    data.push(middle);
                    break;
                case "*":
                    middle=data.pop();
                    middle*=data.pop();
                    data.push(middle);
                    break;
                case "/":
                    middle=data.pop();
                    middle=data.pop()/middle;
                    data.push(middle);
                    break;
                    default:
                        data.push(Integer.valueOf(token));
            }
        }
        return data.peek();
    }
}
