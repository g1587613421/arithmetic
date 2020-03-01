/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.用队列实现栈;

import java.util.PriorityQueue;

public class MyStack {
    private PriorityQueue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new PriorityQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // 先队列头的n-1个元素去除逐个插入到队列尾部，最后再去队列头的元素就是原先尾的元素。
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }

        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        // 先队列头的n-1个元素去除逐个插入到队列尾部，最后再去队列头的元素就是原先尾的元素。
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }

        int top = queue.poll();
        queue.offer(top);
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }


}
