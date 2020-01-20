package 领扣算法.AA中等题.摆动序列;

public class Main {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length<2)
            return nums.length;

        int sum=1,middle=nums[0]-nums[1],add = 0;
        for (int n = 1; n < nums.length-1; n++) {
            add=nums[n]!=nums[n+1]?++add:add;
            if (middle*(nums[n]-nums[n+1])<0){
                sum++;
                middle=nums[n]-nums[n+1];
            }
            if (middle==0)
                middle=nums[n]-nums[n+1];
        }
        return sum+(add==0?0:1);
    }
}
