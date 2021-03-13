/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.杨辉三角形;

import java.util.LinkedList;

public class Main {
    public static void main(String arg[]){//main--来自高金磊

        LinkedList<Integer> data=new LinkedList<>();
        LinkedList<Integer> middle=new LinkedList<>();
        data.add(1);
        for (int i = 0; i < 15; i++) {
            for (Integer datum : data) {
                System.out.print(datum+" ");
            }
            System.out.println();
            data.addFirst(0);
            data.addLast(0);
            while (data.size()>=2){
                int num1=data.pollFirst();
                int num2=data.peekFirst();
                middle.addLast(num1+num2);
            }
            data.clear();
            data.addAll(middle);
            middle.clear();
        }
    }
}
