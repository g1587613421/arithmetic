package 领扣算法.A简单题.杨辉三角1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    List<List<Integer>> result=new LinkedList<>();
    List<Integer> middle;
    public List<List<Integer>> generate(int numRows) {
        if (numRows==0)
            return result;
        for (int i = 0; i < numRows; i++) {
            plus(middle);
            result.add(middle);
        }
        return result;
    }
    int pre;
    private void plus(List<Integer> list){
        middle=new ArrayList<>();
        if (list==null||list.size()==0){
            middle.add(1);
            return;
        }

        pre = 0;
        for (Integer integer : list) {
            middle.add(pre+integer);
            pre=integer;
        }
        middle.add(1);
    }
}
