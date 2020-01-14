package 领扣算法.众数;

import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Integer,Integer> res=new HashMap();
    public int majorityElement(int[] nums) {
        for (int num : nums) {
            res.put(num, res.get(num)==null?1:res.get(num)+1);
            if (res.get(num)>=nums.length*0.5)
                return num;
        }
        return 0;
    }
}
