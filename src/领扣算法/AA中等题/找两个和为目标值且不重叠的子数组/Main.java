/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.找两个和为目标值且不重叠的子数组;

import java.util.LinkedList;


///不对////
public class Main {
    class res{
        int le,ri,size;
        res(int le,int ri){
            size=ri-le+1;
            this.le=le;
            this.ri=ri;
        }
    }
    public int minSumOfLengths(int[] arr, int target) {
        //滑动窗口
        int left=0,right=0;
        LinkedList<res> result=new LinkedList<>();
        int num=arr[0];
        while (right<arr.length){
            if (num==target){
               result.addLast(new res(left, right));
               num-=arr[left];
                left++;
                continue;
            }
            if (num>target){
                num-=arr[left];
                left++;
            }else {
                right++;
                if (right>=arr.length)
                    continue;
                num+=arr[right];
            }
        }
//        Collections.sort(result, (a,b)->(a.le-b.le));
       int size=Integer.MAX_VALUE;
        for (int i = 0; i < result.size(); i++) {
            for (int j = result.size()-1; j >i; j--) {
                int ss=plus(result.get(i), result.get(j));
                if (ss==Integer.MAX_VALUE)
                    break;
                size=Math.min(size, ss);
            }
        }
        return size==Integer.MAX_VALUE?-1:size;
    }
    //l的le肯定小于r的
    int plus(res l,res r){
        if (l.ri>=r.le)
            return Integer.MAX_VALUE;
        return l.size+r.size;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().minSumOfLengths(new int[]{3,2,2,4,3}, 7);
    }
}
