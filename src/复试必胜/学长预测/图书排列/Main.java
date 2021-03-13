/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.图书排列;

import java.util.LinkedList;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        for (int i = 1; i < 11; i++) {
            LinkedList<Integer> data=new LinkedList<>();
            data.add(i);
            plus(data,i);
        }
    }

    private static void plus(LinkedList<Integer> data, int i) {
        if (data.size()==10){
            for (Integer datum : data) {
                System.out.print(datum+"  ");
            }
            System.out.println();
            return;
        }
        for (int i1 = 1; i1 < 11; i1++) {
            if (!data.contains(i1)&&Math.abs(i-i1)!=1)
            {
                LinkedList<Integer> middle=new LinkedList<>(data);
                middle.add(i1);
                plus(middle, i1);
            }
        }
    }
}
