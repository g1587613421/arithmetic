/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.优先队列相关;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class PQ {
    public static void main(String[] arg){//main--来自高金磊
        //初始的大小没有太多作用只是能合理的避免底层数组频繁扩容
        PriorityQueue<Integer> data=new PriorityQueue<>(4,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Deque<Integer> deque=new ArrayDeque<>();//双端队列
        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayBlockingQueue<Integer> arrayBlockingQueue=new ArrayBlockingQueue<>(2);//必须指定其大小
        LinkedBlockingDeque<Integer> linkedBlockingDeque=new LinkedBlockingDeque<>();
//        DelayQueue    --优先级调度队列--单线程--安全--优先级堆支持的、基于时间的调度队列
        //add操作是O(1)
        data.add(5);
        data.add(5);
        data.add(150);
        data.offer(1);
        //取出数据的时间复杂度是O(log2n)--几乎是遍历一遍来寻找符合排队器的值.
        System.out.println(data.peek());
        System.out.println("使用优先队列的排队器进行排队\t"+data.comparator().compare(1, 2));
        System.out.println("可见由于使用过一次peek,所以找到的最大值放到了最前面,这时候如果再peek或者poll就O(1)");
        for (Integer datum : data) {

            System.out.print(datum+"  ");
        }

        data.poll();
        System.out.println();
        System.out.println(data.peek());

        data.add(7);
        System.out.println(data.add(8));

        //异常相关
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        try {
            arrayBlockingQueue.add(4);
        } catch (Exception e) {
            System.err.println("装不下了");
        }
        data.clear();
        System.out.println("poll没有数据了但是不报错");
        System.out.println(data.poll());
        System.out.println("找不到数据了但是不报错");
        System.out.println(data.remove(55));

        try {
            linkedList.remove(5);
            linkedList.pop();//也报错
        } catch (Exception e) {
            System.out.println("找不到数据报错");
            System.out.println(linkedList.poll());
        }
    }
    
    
}
