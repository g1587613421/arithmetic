/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.正负交叉;

import java.util.LinkedList;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        int data[]=new int[]{-1,-2,-3,-1,-3,12,1,32,3,2};
        LinkedList<Integer> data1=new LinkedList<>();
        LinkedList<Integer> data2=new LinkedList<>();
        for (int datum : data) {
            if (datum<0){
                data1.add(datum);
            }
            else {
                data2.add(datum);
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (i%2==0){
                data[i]=data1.pollLast();
            }
            else data[i]=data2.pollLast();
        }
        for (int datum : data) {
            System.out.print(datum+" ");
        }

    }
}
