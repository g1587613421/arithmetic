/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.除自身以外数组的乘积;

public class Main {

    public int[] productExceptSelf(int[] nums) {
        int middle=1;
        boolean b=false;
        for (int num : nums) {
            if (num==0&&!b)
                b=true;
            else
            middle*=num;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(nums[i]==0?middle:(b?0:middle/nums[i]));
        }
        return nums;
    }
}
