package 领扣算法.A简单题.最小栈;

import java.util.Stack;

public class MinStack {
Stack<Integer> data;
int min;
    /** initialize your data structure here. */
    public MinStack() {
        data=new Stack<>();
    }

    public void push(int x) {
        if (data.size()==0)
            min=x;
        min=Math.min(min, x);
        data.push(x);
    }

    public void pop() {
        if (data.pop()==min)
        {
            min=Integer.MAX_VALUE;
            for (Integer datum : data) {
                min=Math.min(min, datum);
            }
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */