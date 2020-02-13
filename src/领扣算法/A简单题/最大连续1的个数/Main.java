/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最大连续1的个数;

import java.util.Arrays;

public class Main {

    StringBuffer data=new StringBuffer();
    public int findMaxConsecutiveOnes(int[] nums) {
        for (int num : nums) {
            data.append(num);
        }
        String middle[]=data.toString().split("0");
        Arrays.sort(middle);
        if (middle.length<1)
            return 0;
        return middle[middle.length-1].length();
    }
}
