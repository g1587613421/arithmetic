package 领扣算法.长度最小子数组;

public class Main {
    int min=Integer.MAX_VALUE;
    public int minSubArrayLen(int s, int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=s)
                return 1;
            plus(s-nums[i], nums, i+1,1);
        }
        return min==Integer.MAX_VALUE?0:min;
    }

    private void plus(int target,int[] nums,int last,int len){
        if (target<=0)
        min=Math.min(len, min);
        if (last>=nums.length||len>=min-1)
            return;
        plus(target-nums[last],nums,last+1, len+1);
    }


}
