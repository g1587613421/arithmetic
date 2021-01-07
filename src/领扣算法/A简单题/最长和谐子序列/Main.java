/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.最长和谐子序列;

import java.util.HashMap;

public class Main {

    HashMap<Integer,Integer> data=new HashMap<>();
    public int findLHS(int[] nums) {
        int len=0;
        for (int num : nums) {
            data.put(num, data.getOrDefault(num, 0)+1);
        }
        for (Integer integer : data.keySet()) {
            if (data.getOrDefault(integer-1, 0)!=0)
            len=Math.max(len, data.get(integer)+data.get(integer-1));
            if (data.getOrDefault(integer+1, 0)!=0)
            len=Math.max(len, data.get(integer)+data.get(integer+1));
        }
        return len;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().findLHS(new int[]{1,3,2,2,5,2,3,7});
    }
}
