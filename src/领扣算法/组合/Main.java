package 领扣算法.组合;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> res;
    List<Integer> middle;
    public List<List<Integer>> combine(int n, int k) {
        for (int i = 1; i < n+1; i++) {
            //驱动第一层向下组合
            res=new ArrayList<>();
            res.add(i);
            Plus(res, n, k-1,i);
        }
        return result;
    }
    void  Plus(List<Integer> res,int n, int k,int start){

        if (n-start+1<k)
            return;
        for (int i = start; i < n+1; i++) {
            if (res.indexOf(i)==-1){
                middle=new ArrayList<>(res);
                middle.add(i);
                Plus(middle, n, k-1,i);
            }

        }
        if (k==0)
        {
            result.add(res);
        }
    }
    public static void main(String arg[]){//main--来自高金磊
        new Main().combine(4, 2);
    }
}
