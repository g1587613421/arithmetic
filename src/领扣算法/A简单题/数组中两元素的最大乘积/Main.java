/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组中两元素的最大乘积;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> data=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o2)-Math.abs(o1);
            }
        });
        for (int num : nums) {
            data.add(num-1);
        }
        return calculate(data.isEmpty()?0:data.poll(), data.isEmpty()?0:data.poll(), data.isEmpty()?0:data.poll(), data.isEmpty()?0:data.poll());

    }
    private int calculate(int a,int b,int c,int d){
        return Math.max(a*b, Math.max(a*c, Math.max(a*d, Math.max(b*c, Math.max(b*d, c*d)))));
    }
}
