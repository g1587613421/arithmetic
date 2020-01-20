package 领扣算法.A简单题.缺失序列;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * 方法3:高时间低内存
     * 0.22
     * 0.93
     */
    public int missingNumber(int[] nums) {
        Set<Integer> data=new HashSet<>();
        for (int num : nums) {
            data.add(num);
        }

        for (int i = 0; i <=data.size()+1; i++) {
            if (!data.contains(i))
                return i;
        }
        return -1;
    }
    public static void main(String arg[]){//main--来自高金磊
     new Main().missingNumber(new int[]{0,1});

    }
    /**
     * 方法二:高时间低内存
     * 0.26
     * 0.98
     */
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=i)
//                return i;
//        }
//        return nums.length;
//    }
    /**
     * 方法一:高时间低内存
     * 0.05
     * 0.99
     */
//    public int missingNumber(int[] nums) {
//        int middle=0;
//        List<Integer> data=new ArrayList<>();
//        for (int num : nums) {
//            middle=Math.max(middle, num);
//            data.add(num);
//        }
//        for (int i = 0; i <=middle; i++) {
//            if (data.indexOf(i)==-1)
//                return i;
//        }
//        return -1;
//    }
}
