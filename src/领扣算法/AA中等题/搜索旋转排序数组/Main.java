/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.搜索旋转排序数组;

public class Main {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int pre = 0, las = nums.length - 1;
        while (pre<=las){
            if (nums[pre]==target)
                return pre;
            if (nums[las]==target)
                return las;
            int middle=(las+pre)/2;
            if (nums[middle]==target)
                return middle;
            if (nums[middle]>=nums[pre]){
                if ((nums[middle]-target)*(nums[pre]-target)<0) {
                    las = middle;
                    pre++;
                }else {
                    pre=middle+1;
                    las--;
                }
            }
            else{
                if ((nums[middle]-target)*(nums[las]-target)<0){
                    pre=middle+1;
                    las--;
                }
                else {
                    las=middle-1;
                    pre++;
                }
            }
        }
        return -1;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().search(new int[]{5,3}, 0);
    }
}
