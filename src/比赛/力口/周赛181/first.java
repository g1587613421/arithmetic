/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛181;

import java.util.LinkedList;

public class first {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> missle=new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            missle.add(index[i],nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=missle.get(i);

        }
        return nums;
    }
}
