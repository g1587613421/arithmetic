/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020团队赛;

public class forth {

    int count;
    public int splitArray(int[] nums) {
        count=nums.length;
        int n=0;
        plus(nums, 0, 0);
        return count;
    }

    private void plus(int[] nums,int index,int cou){
        if (cou>=count||count<3)
            return;
        if (index>=nums.length){
            count=cou;
            return;
        }
        for (int i =nums.length-1; i >=index; i--) {
            if (getNumber(nums[index],nums[i])!=1){
                plus(nums, i+1, cou+1);
            }
        }
    }

    private static int getNumber(int x, int y) {
        if(x%y==0||y%x==0){
            return x;
        }
        int big=x>y?x:y;
        int small=x<y?x:y;
        return getNumber(big-small,small);
    }

    public static void main(String arg[]){//main--来自高金磊

    }
}
