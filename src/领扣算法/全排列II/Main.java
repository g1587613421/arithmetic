package 领扣算法.全排列II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    List<Integer> middle,middle2;//去重,专用
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : disAarray(nums)) {
            List<Integer> res=new ArrayList<>();
            res.add(num);
            List<Integer> data=new ArrayList<>(middle2);
            data.remove(data.indexOf(num));
            plus(res, data);
        }
        return result;
    }
    public void plus(List<Integer> res,List<Integer> data){
        if (data.size()==0) {
            result.add(res);
            return;
        }
        for (Integer datum : disList(data)) {
            List<Integer> re=new ArrayList<>(res);
            re.add(datum);
            List<Integer> dd=new ArrayList<>(data);
            dd.remove(datum);
            plus(re,dd);
        }
    }
    public List<Integer> disList(List<Integer> nums){
        middle=new LinkedList<>();
        for (int num : nums) {
            if (middle.indexOf(num)==-1)
                middle.add(num);
        }
        return middle;
    }
    public List<Integer> disAarray(int[] nums){
        middle=new LinkedList<>();
        middle2=new ArrayList<>();
        for (int num : nums) {
            middle2.add(num);
            if (middle.indexOf(num)==-1)
                middle.add(num);
        }
        return middle;
    }
    public static void main(String[] arg){//main--来自高金磊
     new Main().permuteUnique(new int[]{1,1,2});

    }
}
