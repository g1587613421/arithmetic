package 领扣算法.AA简单题.旋转数组;

public class Main {
    public void rotate(int[] nums, int k) {
       if (k%(nums.length)>0)
       {
           int middle=nums[0],middle2;
           for (int i = 0; i < nums.length; i++) {
              middle2=nums[i];
              nums[i]=middle;
              middle=middle2;
           }
           nums[0]=middle;
           rotate(nums, k-1);
       }
    }
}
