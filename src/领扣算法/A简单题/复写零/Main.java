/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.复写零;

import java.util.LinkedList;

public class Main {
    public void duplicateZeros(int[] arr) {
        LinkedList<Integer> data=new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                data.addFirst(0);
                data.addFirst(0);
            }
            else {
                data.addFirst(arr[i]);
            }
            arr[i]=data.pollLast();

        }
    }
}
