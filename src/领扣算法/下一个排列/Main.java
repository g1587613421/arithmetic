package 领扣算法.下一个排列;

import java.util.Arrays;

public class Main {

    public void nextPermutation(int[] nums) {
        int middle;
        int m=-1;
        for (int i = nums.length-1; i >=0; i--) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i]<nums[j]){
//                    plus(nums,j,i);
                    if (m==-1){
                        m=j;
                        continue;
                    }
                    if (nums[m]>nums[j])
                        m=j;
                }
            }
            if (m!=-1){
                middle=nums[i];
                nums[i]=nums[m];
                nums[m]=middle;
                plus2(nums,i+1);
                return;
            }
        }
        Arrays.sort(nums);
    }

    private void plus2(int[] nums, int i) {
        int middle;
        for (int j = i; j <nums.length ; j++) {
            for (int k = i; k <nums.length -1; k++) {
                if (nums[k]>nums[k+1])
                {
                    middle=nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]=middle;
                }
            }

        }
    }

    //    private void plus(int[] nums, int j, int i) {
//        int middle=nums[j];
//        int middle2;
//        nums[j]=nums[i];
//        for (int k = j+1; k <=i ; k++) {
//           middle2=nums[k];
//           nums[k]=middle;
//           middle=middle2;
//        }
//    }
    public static void main(String arg[]){//main--来自高金磊
     new Main().nextPermutation(new int[]{4,2,0,2,3,2,0});

    }
}
