package 领扣算法.AA中等题.移除数组;

public class Main {
    int sum=0;
    int i = 0;
    public int removeElement(int[] nums, int val) {

        for (;i < nums.length; i++) {
            if (val!=nums[i])
                nums[sum++]=nums[i];
        }
        return sum;
    }
}
