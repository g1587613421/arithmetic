/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.找到K个最接近的元素;

import java.util.*;

public class Main {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> data=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int middle=Math.abs(o1-x)-Math.abs(o2-x);
                return middle!=0?middle:o1-o2;
            }
        });
        for (int i : arr) {
            data.add(i);
        }
        LinkedList<Integer> res=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            System.out.println(data.peek());
            res.addLast(data.poll());
        }
        Collections.sort(res);
        return res;
    }
}
