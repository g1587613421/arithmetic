package 领扣算法.A简单题.存在重复元素;

import java.util.HashSet;
import java.util.Set;

public class Main {
    Set<Integer> res=new HashSet<>();
    //利用集合特性
    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            if (res.remove(num)){
                return true;
            }else res.add(num);
        }
        return false;
    }
}
