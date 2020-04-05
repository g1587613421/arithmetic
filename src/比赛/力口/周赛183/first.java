/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛183;

import java.util.*;

public class first {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int sum=Arrays.stream(nums).sum();
        PriorityQueue<Integer> data=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int num : nums) {
            data.add(num);
        }
        int middle=0;
        while (middle<=sum-middle){
            middle+=data.peek();
            res.add(data.poll());
        }
        return res;
    }
}
