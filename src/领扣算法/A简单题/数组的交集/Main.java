package 领扣算法.A简单题.数组的交集;
import java.util.HashMap;
import java.util.LinkedList;


public class Main {
    //应该用set的不过这个也行
    HashMap<Integer, Boolean> data=new HashMap<>();
    LinkedList<Integer> res=new LinkedList<>();
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length==0||nums2.length==0)
            return new int[0];
        for (int i : nums1) {
            if (!data.containsKey(i))
                data.put(i, true);
        }
        for (int i : nums2) {
            if (data.containsKey(i)){
                res.add(i);
                data.remove(i);
            }

        }
        int[] result=new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i]=res.get(i);
        }
        return result;

    }
}
