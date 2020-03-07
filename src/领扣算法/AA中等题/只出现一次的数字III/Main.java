/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.只出现一次的数字III;

import java.util.HashSet;

public class Main {

    public int[] singleNumber(int[] nums) {
        HashSet<Integer> data=new HashSet<>();
       int[] res=new int[2];
        for (int num : nums) {
            if (data.contains(num))
                data.remove(num);
            else
                data.add(num);
        }
        int middle=0;
        for (Integer datum : data) {
            res[middle++]=datum;
        }
        return res;

    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().singleNumber(new int[]{1,2,1,3,2,5});
    }
}
