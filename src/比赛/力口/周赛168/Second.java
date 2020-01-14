package 比赛.力口.周赛168;

import java.util.Arrays;

public class Second {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length%k!=0)
            return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0)
                continue;
            try {
               // nums[i]=0;
                Plus(nums, k-1,nums[i]+1,i+1);
            } catch (Exception e) {
               return false;
            }
        }

        return true;
    }

   void Plus(int[] nums,int k,int target,int start) throws Exception {
       nums[start-1]=0;
        if (k==0)
            return;
       for (;  start<nums.length ; start++) {
           if (nums[start]>target)
               throw new Exception();
           if (nums[start]==target)
           {

               Plus(nums,k-1,nums[start]+1,start+1);

               return;
           }
       }

       throw new Exception();
    }
public static void main(String arg[]){//main--来自高金磊

    System.out.println(new Second().isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4));
}
}
