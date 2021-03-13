/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.带重复元素的排列;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    static HashSet<String> flag=new HashSet<>();
    public static void main(String arg[]){//main--来自高金磊

//        int[] nums=new int[]{1,2,3,3,3,4,4,4,5};
        int[] nums=new int[]{1,1,2};
        LinkedList<Integer> data=new LinkedList<>();
        for (int num : nums) {
            data.add(num);
        }
        for (Integer datum : data) {
            if (flag.contains(""+datum))
                continue;
            LinkedList<Integer> middle=new LinkedList<>(data);
            middle.remove(datum);
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(datum);
            flag.add(stringBuilder.toString());
            plus(stringBuilder,middle);
        }
    }

    private static void plus(StringBuilder stringBuilder, LinkedList<Integer> middle) {
        if (middle.isEmpty())
        {
            System.out.println(stringBuilder);
            return;
        }
        for (Integer integer : middle) {
            StringBuilder stringBuilder1=new StringBuilder(stringBuilder);
            stringBuilder1.append(" ");
            stringBuilder1.append(integer);
            if (flag.contains(stringBuilder1.toString()))
                return;
            flag.add(stringBuilder1.toString());
            LinkedList<Integer> data=new LinkedList<>(middle);
            data.remove(integer);
            plus(stringBuilder1, data);
        }
    }
}
