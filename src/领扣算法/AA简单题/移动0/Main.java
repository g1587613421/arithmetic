package 领扣算法.AA简单题.移动0;

public class Main {
    public void moveZeroes(int[] nums) {
        int pre=0;
        int i=0;
        for (i = 0; i < nums.length;i++) {
            if (nums[i]!=0)
                nums[pre++]=nums[i];
        }
        for (i = pre; i <nums.length ;) {
            nums[i++]=0;
        }
    }
}
