/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.数组大小减半;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int i : arr) {
            data.put(i, data.getOrDefault(i, 0)+1);
        }
        LinkedList<Integer> linkedList=new LinkedList<>(data.values());
        Collections.sort(linkedList);
        int count=0;
        int size=arr.length;
        while ((size>arr.length/2)){
            size-=linkedList.pollLast();
            count++;
        }
        return count;
    }
}
