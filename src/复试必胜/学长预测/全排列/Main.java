/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.全排列;

import java.util.LinkedList;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        int[] data=new int[]{1,2,3,4,5,6,7,8,9};
        LinkedList<Integer> middle=new LinkedList<>();
        for (int datum : data) {
            middle.add(datum);
        }
        plus(new LinkedList<Integer>(),middle);
    }

    private static void plus(LinkedList<Integer> integers, LinkedList<Integer> middle) {
        if (middle.isEmpty()){
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println();
            return;
        }
        for (Integer integer : middle) {
            LinkedList<Integer> mm=new LinkedList<>(middle);
            mm.remove(integer);
            LinkedList<Integer> integers1=new LinkedList<>(integers);
            integers1.add(integer);
            plus(integers1, mm);
        }
    }
}
