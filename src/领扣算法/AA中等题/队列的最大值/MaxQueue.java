/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.队列的最大值;

import java.util.LinkedList;

public class MaxQueue {
    int max_;
    LinkedList<Integer> queue;
        public MaxQueue() {
            queue=new LinkedList<>();

            max_=Integer.MIN_VALUE;
        }

        public int max_value() {
            return queue.size()==0?-1:max_;
        }

        public void push_back(int value) {
            max_=Math.max(value, max_);
            queue.addLast(value);
        }
        int value;
        public int pop_front() {
            System.out.println(max_);
            if (queue.size()==0)
                return -1;
            value=queue.pollFirst();
            if (value==max_){
                max_=Integer.MIN_VALUE;
            for (Integer integer : queue) {
                max_=Math.max(integer, max_);
            }}
            return value;
        }

}
