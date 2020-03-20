/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.区域和检索数组可修改;
class NumArray {
    int[] data;
    int[] dasum;
    public NumArray(int[] nums) {
        this.data=nums;
        dasum=new int[nums.length+1];
        for (int i = 0; i <data.length; i++) {
            dasum[i+1]=data[i]+dasum[i];
        }
    }

    public void update(int i, int val) {
        if (data.length<i)
            return;
        data[i]=val;
        for (int j = i; j < data.length; j++) {
            dasum[j+1]=dasum[j]+data[j];
        }

    }

    public int sumRange(int i, int j) {
        return dasum[j+1]-dasum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */