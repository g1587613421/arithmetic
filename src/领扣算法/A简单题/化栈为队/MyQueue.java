/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.化栈为队;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> data1,data2;
    /** Initialize your data structure here. */
    public MyQueue() {
        data1=new Stack<>();
        data2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
       while (!data2.isEmpty()){
           data1.push(data2.pop());
       }
       data1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!data1.isEmpty()){
            data2.push(data1.pop());
        }
        return data2.pop();

    }

    /** Get the front element. */
    public int peek() {
        while (!data1.isEmpty()){
            data2.push(data1.pop());
        }
        return data2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data2.isEmpty()&&data1.isEmpty();
    }
}
