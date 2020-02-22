/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法图解;

import java.util.HashSet;

public class 集合操作 {
    
    public static void main(String arg[]){//main--来自高金磊
        HashSet<Integer> set=new HashSet();
        HashSet<Integer> set1=new HashSet();
        set.add(1);
        set.add(2);
        set1.add(2);
        set1.add(3);
        System.out.println("交集");
        set1.retainAll(set);
        for (Integer integer :set1 ) {
            System.out.print(integer+"\t");
        }
        set1.add(3);
        System.out.println();
        System.out.println("并集");
        set.addAll(set1);
        for (Integer integer : set) {
            System.out.print(integer+"\t");
        }
        System.out.println();
        System.out.println("差集");
        set.removeAll(set1);
        for (Integer integer : set) {
            System.out.println(integer+"\t");
        }
        System.out.println();
        System.out.println("去重");

        set.add(1);
        set.add(1);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
