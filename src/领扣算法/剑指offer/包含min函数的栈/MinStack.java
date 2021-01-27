/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.包含min函数的栈;

import java.util.LinkedList;

class MinStack {
    int min=Integer.MAX_VALUE;
    LinkedList<Integer> data;


    /** initialize your data structure here. */
    public MinStack() {
        data=new LinkedList<>();
    }

    public void push(int x) {
        min=Math.min(x, min);
        data.addFirst(x);
    }

    public void pop() {
        if (data.pollFirst()==min)
        {
            min=Integer.MAX_VALUE;
            for (Integer datum : data) {
                min=Math.min(datum, min);
            }
        }
    }

    public int top() {
        return data.peekFirst();
    }

    public int min() {
        return min;
    }
}
