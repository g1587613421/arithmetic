/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.两个数组的交集II;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    HashMap<Integer,Integer> data1=new HashMap<>();
    HashMap<Integer,Integer> data2=new HashMap<>();
    public int[] intersect(int[] nums1, int[] nums2) {
        for (int i : nums1) {
//            data1.put(i, data2.getOrDefault(i, 0)+1);
            if (data1.containsKey(i))
                data1.put(i, data1.get(i)+1);
            else
                data1.put(i, 1);
        }
        for (int i : nums2) {
//            data2.put(i, data2.getOrDefault(i, 0)+1);
            if (data2.containsKey(i))
                data2.put(i, data2.get(i)+1);
            else
                data2.put(i, 1);
        }
        ArrayList<Integer> middle=new ArrayList<>();
        for (Integer integer : data1.keySet()) {
            if (data2.containsKey(integer))
            {
             int n=Math.min(data1.get(integer), data2.get(integer));
                for (int i = 0; i < n; i++) {
                    middle.add(integer);
                }
            }
        }
        int res[]=new int[middle.size()];
        for (int i = 0; i < middle.size(); i++) {
            res[i]=middle.get(i);
        }
        return res;
    }

    public static void main(String arg[]){//main--来自高金磊

        Main main=new Main();
        int[] a={1,2,2,1};
        int[] b={2,2};
        main.intersect(a, b);
    }
}
