/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.相对名次;

import java.util.Arrays;

public class Main {

    public String[] findRelativeRanks(int[] nums) {
        int[][] data = new int[nums.length][2];
        for (int i = 0; i < data.length; i++) {
            data[i]=new int[]{nums[i],i};
        }
        Arrays.sort(data,(a,b)->(b[0]-a[0]));
        for (int i = 0; i < data.length; i++) {
            data[i][0]=i+1;
        }
        String[] res=new String[nums.length];
            try {
                res[data[0][1]]="Gold Medal";
                res[data[1][1]]="Silver Medal";
                res[data[2][1]]="Bronze Medal";
            } catch (Exception e) {
               return res;
            }
            for (int i = 3; i < data.length; i++) {
            res[data[i][1]]=""+data[i][0];
        }
        return res;
    }
}
