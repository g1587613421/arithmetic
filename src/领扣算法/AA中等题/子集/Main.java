package 领扣算法.AA中等题.子集;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static   List<List<Integer>> result=new LinkedList<>();
    static LinkedList<Integer> middle;
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> res;
        result.add(new LinkedList<>());
        for (int i = 0; i < nums.length; i++) {
            res = new LinkedList<>();
            res.add(nums[i]);
            plus(i, res, nums);
        }


        return result;
    }
    private static void plus(int start,List<Integer> res,int[] nums){
        result.add(res);
        for (int i = start+1; i < nums.length; i++) {
            middle=new LinkedList<>(res);
            middle.add(nums[i]);
            plus(i, middle, nums);
        }
    }

}
