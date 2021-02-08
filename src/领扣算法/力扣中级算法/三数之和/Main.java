/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.力扣中级算法.三数之和;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new LinkedList<>();
        List<Integer> res;
        HashSet<String> data=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k]==0)
                    {
                        if (!data.contains(""+nums[i]+nums[j])){
                            res=new LinkedList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            result.add(res);
                            data.add(""+nums[i]+nums[j]);
                            data.add(""+nums[i]+nums[k]);
                            data.add(""+nums[j]+nums[i]);
                            data.add(""+nums[j]+nums[k]);
                            data.add(""+nums[k]+nums[i]);
                            data.add(""+nums[k]+nums[j]);
                        }

                    }
                }

            }

        }
        return result;
    }
}
