/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组的相对排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedList<Integer> linkedList=new LinkedList();
        for (int i : arr2) {
            linkedList.addLast(i);
        }
        int data[][]=new int[arr1.length][2];
        for (int i = 0; i < arr1.length; i++) {
            data[i][0]=arr1[i];
            data[i][1]=linkedList.contains(arr1[i])?linkedList.indexOf(arr1[i]):Integer.MAX_VALUE;
        }
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=data[i][0];

        }
        return arr1;
    }
}
