package 领扣算法.AA简单题.区域检索;

public class NumArray {
    int data[];

    public NumArray(int[] nums) {
        data=nums;
    }

    public int sumRange(int i, int j) {
      if (i==j)
          return data[i];
      return data[i]+sumRange(i+1, j);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */