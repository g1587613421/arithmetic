package 领扣算法.AA中等题.在排序数组中查找元素的第一个和最后一个位置;

public class Main
{
    public int[] searchRange(int[] nums, int target) {

        if (nums.length==1&&nums[0]==target){
            return new int[]{0,0};
        }
        if (nums.length<=1){
            return new int[]{-1,-1};
        }
        int middle1=nums.length-1,middle2=0;
        while (nums[middle2]!=nums[middle1]){
            if (nums[(middle2+middle1)/2+1]==target){
                middle1=middle2=(middle2+middle1)/2+1;
                while (--middle1>=0&&target==nums[middle1]);
                while (++middle2<nums.length&&target==nums[middle2]);
                return new int[]{middle1+1,middle2-1};
            }
            if (nums[(middle2+middle1)/2+1]>target)
                middle1=(middle2+middle1)/2;
            else
                middle2=(middle2+middle1)/2+1;
            if (middle1-middle2==1&&nums[middle1]!=target&&nums[middle2]!=target)
                return new int[]{-1,-1};
        }
        if (nums[middle1]==target&&nums[middle2]==target)
        return new int[]{middle2,middle1};
        else
            return new int[]{-1,-1};
    }

}
