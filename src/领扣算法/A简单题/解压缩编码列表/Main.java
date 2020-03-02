/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.解压缩编码列表;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> data=new ArrayList<>();
    public int[] decompressRLElist(int[] nums) {
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                data.add(nums[i+1]);
            }
        }

        int res[]=new int[data.size()];
        int i=0;
        for (Integer datum : data) {
            res[i++]=datum;
        }
        return res;
    }
}
