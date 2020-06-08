/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.其他;

import java.util.Arrays;
import java.util.PriorityQueue;

public class A {

    int find_k(int[] data,int k){
        Arrays.sort(data);
        return data[k];
    }
    int find_kqueue(Integer[] data,int k){
        PriorityQueue<Integer> da=new PriorityQueue<>((a,b)->(a-b));
        for (Integer datum : data) {
            da.add(datum);
        }
        for (int i = 0; i < k-1; i++) {
            da.poll();
        }
        return da.peek();
    }

}
