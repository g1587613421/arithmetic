/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.循环队列的实现;

class MyCircularQueue {
    int data[];
    int pre=0,last=0;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data=new int[k+1];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if ((last+1)%data.length==pre)
            return false;
        data[last]=value;
        last=(last+1)%data.length;

        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty())
            return false;
       pre=(pre+1)%data.length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty())
            return -1;
        return data[pre];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty())
            return -1;
return data[(data.length+last-1)%data.length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return pre==last;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (last+1)%data.length==pre;
    }
    public static void main(String arg[]){//main--来自高金磊
        MyCircularQueue obj = new MyCircularQueue(3);
        boolean param_1 = obj.enQueue(1);
        param_1 = obj.enQueue(2);
         param_1 = obj.enQueue(3);
         param_1 = obj.enQueue(4);
         param_1 = obj.enQueue(5);
        boolean param_2 = obj.deQueue();
         param_2 = obj.deQueue();
         param_2 = obj.deQueue();
        param_1 = obj.enQueue(4);
        param_1 = obj.enQueue(5);
         param_2 = obj.deQueue();
         param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    }
}



/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */