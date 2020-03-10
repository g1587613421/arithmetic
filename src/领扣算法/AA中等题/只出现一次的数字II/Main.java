/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.只出现一次的数字II;

import java.util.ArrayList;

public class Main {

    public int singleNumber(int[] nums) {
        ArrayList<Integer> data1=new ArrayList<>(),data2=new ArrayList<>();
        for (Integer integer : nums) {
           if (data1.contains(integer))
               data2.add(integer);
           else
               data1.add(integer);
        }
       data1.removeAll(data2);
        return data1.get(0);
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().singleNumber(new int[]{2,2,3,2});
    }
}
