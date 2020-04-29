/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.KthLargestElementinaStream;

import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> data;
    int size;
    public KthLargest(int k, int[] nums) {
        size=k;
        data=new PriorityQueue<>(k,(a,b)->(b-a));
        for (int num : nums) {
            if (data.size()!=k){
                data.offer(-num);
            }else {
                if (data.peek()>-num){
                    data.poll();
                    data.offer(-num);
                }
            }
        }
    }

    public int add(int val) {
        if (data.size()!=size){
           data.offer(-val);
           return -data.peek();
        }else {
            if (data.peek()>-val){
                data.poll();
                data.offer(-val);
            }
            return -data.peek();
        }
    }


    public static void main(String arg[]){//main--来自高金磊

        KthLargest ob=new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(ob.add(3));
        System.out.println(ob.add(5));
        System.out.println(ob.add(10));
        System.out.println(ob.add(9));
        System.out.println(ob.add(4));
    }
}
