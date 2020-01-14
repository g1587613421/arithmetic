package 领扣算法.组合总和;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int middletag;
        List<Integer> list;
        for (int n=candidates.length-1;n>=0;n--){
            if (n==0);
            //判断一倍cnadidates[n]是否成立
            middletag = target-candidates[n];
            if (middletag>=0){
                list = new ArrayList<Integer>();
                list.add(candidates[n]);
                seek(n,candidates,middletag,list);
            }
        }

        return result;
    }

    private void seek(int start, int[] candidates, int middletag, List<Integer> integers) {
        if (start<0||middletag<=0) {//递归终止情况
            if (middletag == 0) //终止时当前结果是否有效
                result.add(integers);
            return;
        }
        List<Integer> list;
        //继续完全递归
        for (int n=start;n>=0;n--){
            //克隆start个列表
            list = new ArrayList<>(integers);
            list.add(candidates[n]);
            seek(n, candidates, middletag-candidates[n],list);
        }
    }


//    /***将一个数组的问题简化成一个元素的问题
//     * @param start
//     * @param candidates
//     * @param target
//     * @return
//     */
//    private void seek(int start, int[] candidates, int target,List<Integer> re,boolean b){
//        if (b)
//        re.add(candidates[start]);
//        if (start<0){
//            if (target==0)
//            result.add(re);
//            return;
//        }
//        //针对于candid[start]
//        for (int n=0;;n++){
//            if (n>=1){
//                re.add(candidates[start]);
//            }
//            if (target>0){
//                List<Integer> middle = new ArrayList<>(re);
//                if (start!=0)
//                seek(start-1,candidates, target-candidates[start-1],middle,true);
//            }else {
//                if (start>0){
//                    //补偿跳过本次运算
//                    List<Integer> middle = new ArrayList<>(re);
//                    seek(start-1, candidates, target,middle,false);
//                }
//                if (target==0) {
////                    re.add(candidates[start]);
//                    result.add(re);
//                }
//                break;
//            }
//            target-=candidates[start];
//
//        }
//    }

    public static void main(String arg[]){//main--来自高金磊
     new Main().combinationSum(new int[]{2,3,5}, 7);

    }
}
