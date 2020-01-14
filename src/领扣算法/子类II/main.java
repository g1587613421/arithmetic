package 领扣算法.子类II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class main {
    List<List<Integer>> result=new LinkedList<>();
    List<Integer> res=new LinkedList<>();
    List<String> middle=new ArrayList<>();
    String key,keym;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result.add(new LinkedList<>());
        for (int i = 0; i < nums.length; i++) {
            key=""+nums[i];
            if (middle.contains(key))
                continue;
            res = new LinkedList<>();
            res.add(nums[i]);
            middle.add(key);
            plus(i, res, nums,key);
        }


        return result;
    }
    private  void plus(int start,List<Integer> res,int[] nums,String key){
        result.add(res);
        for (int i = start+1; i < nums.length; i++) {
            keym=key+nums[i];
            if (middle.contains(keym))
                continue;
            this.res=new LinkedList<>(res);
            this.res.add(nums[i]);
            middle.add(keym);
            plus(i, this.res, nums,keym);
        }
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new main().subsetsWithDup(new int[]{1,2,3});
    }
}
