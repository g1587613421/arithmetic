package 领扣算法.AA中等题.搜索插入位置;

public class Main {

    public int searchInsertP(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }

        return nums.length;
    }
//优化
public int searchInsert(int[] nums, int target) {
    int L = 0;
    int R = nums.length-1;
    int mid;
    while(L <= R){
        mid = (L + R)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid]>target){
            R = mid - 1;
        }else{
            L = mid + 1;
        }
    }
    return L;
}
}
