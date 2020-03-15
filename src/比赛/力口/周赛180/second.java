/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛180;

import java.util.LinkedList;

class CustomStack {
    LinkedList<Integer> data=new LinkedList<>();
    int maxSize,size=0;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
    }

    public void push(int x) {
        if (maxSize<size+1)
            return;
        size++;
        data.addLast(x);
    }

    public int pop() {
        if (size==0)
            return -1;
        size--;
        return data.pollLast();
    }

    public void increment(int k, int val) {
        k=Math.min(k, size);
        for (int i = 0; i < size; i++) {
            if (i<k){
                data.addLast(data.pollFirst()+val);
            }
            else data.addLast(data.pollFirst());
        }
    }
}


//    CustomStack customStack = new CustomStack(3); // 栈是空的 []
//customStack.push(1);                          // 栈变为 [1]
//        customStack.push(2);                          // 栈变为 [1, 2]
//        customStack.pop();                            // 返回 2 --> 返回栈顶值 2，栈变为 [1]
//        customStack.push(2);                          // 栈变为 [1, 2]
//        customStack.push(3);                          // 栈变为 [1, 2, 3]
//        customStack.push(4);                          // 栈仍然是 [1, 2, 3]，不能添加其他元素使栈大小变为 4
//        customStack.increment(5, 100);                // 栈变为 [101, 102, 103]
//        customStack.increment(2, 100);                // 栈变为 [201, 202, 103]
//        customStack.pop();                            // 返回 103 --> 返回栈顶值 103，栈变为 [201, 202]
//        customStack.pop();                            // 返回 202 --> 返回栈顶值 102，栈变为 [201]
//        customStack.pop();                            // 返回 201 --> 返回栈顶值 101，栈变为 []
//        customStack.pop();                            // 返回 -1 --> 栈为空，返回 -1

