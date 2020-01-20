package 领扣算法.AA中等题.跳跃数组;

public class Main {
    boolean res=false;
    boolean[] midde;
    public boolean canJump(int[] nums) {
        midde=new boolean[nums.length];
        plus(nums, 0);
        return res;
    }
    public void plus(int[] nums,int step){
        if (step==nums.length-1)
            res=true;
        if (!res&&step<nums.length&&!midde[step]) {
            midde[step]=true;
            for (int i = 1; i <= nums[step]; i++) {
                plus(nums, step + i);
            }
        }
    }
}
