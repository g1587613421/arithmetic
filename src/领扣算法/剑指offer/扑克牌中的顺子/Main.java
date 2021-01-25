/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.扑克牌中的顺子;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int middle=0;
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int num : nums) {
            if (num==0){
                middle++;
                continue;
            }
            linkedList.addLast(num);
        }
        return true;

    }
}
