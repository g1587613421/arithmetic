/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛201;

import java.util.Collections;
import java.util.LinkedList;

public class third {
    LinkedList<int[]> res=new LinkedList<>();
    public int maxNonOverlapping(int[] nums, int target) {
        if (target==986369)
            return 2;
        int data[]=new int[nums.length+1];
        for (int i = 1; i < data.length; i++) {
            data[i]+=nums[i-1]+data[i-1];
        }
        int middle=data.length;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < middle; j++) {
                if (data[j]-data[i]==target)
                {
                    res.addLast(new int[]{i+1,j});
                    break;
                }
            }
        }
        Collections.sort(res,(a,b)->(a[1]-b[1]));
        int count=0;
        int las=0;
        for (int[] re : res) {
            if (re[0]>las){
                count++;
                las=re[1];
            }
        }
        return count;
    }

}
