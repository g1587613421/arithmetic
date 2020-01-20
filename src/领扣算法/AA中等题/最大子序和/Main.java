package 领扣算法.AA中等题.最大子序和;

public class Main {
    public int maxSubArray(int[] nums) {
        int maxx=nums[0];
        int middle=maxx;
        int n;
        for (n = 1; n < nums.length; n++) {
            if (middle<0&&nums[n]>middle){
                middle=nums[n];
            }
            else {
                middle+=nums[n];
            }
            maxx=Math.max(middle, maxx);
        }

        return maxx;
    }
}
