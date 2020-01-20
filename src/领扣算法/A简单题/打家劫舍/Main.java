package 领扣算法.A简单题.打家劫舍;

public class Main {
//    int max;
//    Map<Integer,Integer> middle=new  HashMap<>();
//    public int rob(int[] nums) {
//        if (nums.length==0)
//            return 0;
//        max=nums[0];
//        int s1=0;
//        int s2=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i%2==0){
//                s2+=nums[i];
//                middle.put(i, s2);
//            }else
//            {
//                s1+=nums[i];
//                middle.put(i, s1);
//            }
//
//        }
//        plus(nums,0,0,false);
//        plus(nums,1,0,false);
//        return max;
//    }
//    private void plus(int[] nums,int start,int sum,boolean b){
//        if (start>=nums.length) {
//            max = Math.max(max, sum);
//            return;
//        }
//        sum+=nums[start];
//        if (middle.get(start)>sum)
//            return;
//        else
//            middle.put(start, sum);
//
//            plus(nums, start+2, sum,false);
////            if (!b)
//            plus(nums, start+3, sum,true);
//
//    }

        public int rob(int[] nums) {
            int len = nums.length;
            if(len == 0)
                return 0;
            int[] dp = new int[len + 1];
            dp[0] = 0;
            dp[1] = nums[0];
            for(int i = 2; i <= len; i++) {
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
            }
            return dp[len];
        }
}
