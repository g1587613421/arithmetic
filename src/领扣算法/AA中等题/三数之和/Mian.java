package 领扣算法.AA中等题.三数之和;

import java.util.Arrays;
import java.util.List;

public class Mian {
    public List<List<Integer>> threeSum(int[] nums) {
        //数据预处理
        //排序
        Arrays.sort(nums);
        int zero=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]*nums[i+1]>=0){
                zero=i+1;//从i+1到最后都是正数
            }

        }
        return null;
    }
}
