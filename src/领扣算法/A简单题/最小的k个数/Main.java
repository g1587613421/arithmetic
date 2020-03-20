/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最小的k个数;

import java.util.PriorityQueue;

public class Main {

    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> data=new PriorityQueue<>((a,b)->(a-b));

        for (int i : arr) {
            data.add(i);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=data.poll();
        }
        return res;

    }
}
