/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.数组中的k个最强值;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m=find(arr);
Comparator comparator= new Comparator<Integer>(){
    @Override
    public int compare(Integer o1, Integer o2) {
        return (Math.abs(o1 - m) > Math.abs(o2 - m)) || ((Math.abs(o1 - m) == Math.abs(o2 - m) && (o1 > o2)))?-1: 1;
    }};
        LinkedList<Integer> data=new LinkedList<>();
        for (int i : arr) {
            data.add(i);
        }
        Collections.sort(data, comparator);

        int res[]=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=data.pollLast();
        }
        return res;
    }

    private int find(int[] arr) {
        if (arr.length%2==1){
            return arr[arr.length/2];
        }
        else {
            return (arr[arr.length/2-1]+arr[arr.length/2])/2;
        }
    }


    public static void main(String arg[]){//main--来自高金磊

        new Main().getStrongest(new int[]{-7,22,17,3}, 2);
    }
}
