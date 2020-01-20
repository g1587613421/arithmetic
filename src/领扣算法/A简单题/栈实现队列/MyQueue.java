package 领扣算法.A简单题.栈实现队列;


import java.util.Stack;

/**方法1
 * 0.92
 * 0.71
 */
class MyQueue {
    Stack<Integer> data,middle;
    /** Initialize your data structure here. */
    public MyQueue() {
        data=new Stack<>();
        middle=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (data.size()>0)
            middle.push(data.pop());
        data.push(x);
        while (middle.size()>0)
            data.push(middle.pop());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return data.pop();
    }

    /** Get the front element. */
    public int peek() {
        return data.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
