/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020;

import java.util.Arrays;
import java.util.HashSet;

public class third {




    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int res[]=new int[requirements.length];
        Arrays.fill(res, -1);
        for (int i = 1; i < increase.length; i++) {
            increase[i]=new int[]{increase[i][0]+increase[i-1][0],increase[i][1]+increase[i-1][1],increase[i][2]+increase[i-1][2]};
        }
        HashSet<int[]> data=new HashSet<>();
        for (int i = 0; i < requirements.length; i++) {
            if (plus(requirements[i],increase[increase.length-1]))
            data.add(new int[]{requirements[i][0],requirements[i][1],requirements[i][2],i});
        }
        HashSet<int[]> middle=new HashSet<>();
        for (int i = increase.length-1; i>=0  ; i--) {
            for (int[] datum : data) {
                if (!plus(increase[i],datum)){
                    middle.add(datum);
                    res[datum[3]]=i+2;
                }
            }
            data.removeAll(middle);
            middle.clear();
        }
        for (int[] datum : data) {
            if (Arrays.stream(datum).max().getAsInt()==0)
            res[datum[3]]=0;
            else res[datum[3]]=1;
        }
        return res;
    }

    boolean plus(int[] nums,int[] nums1){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums1[i])
                return false;

        }
        return true;
    }



    public static void main(String arg[]){//main--来自高金磊

        new third().getTriggerTime(new int[][]{{2,8,4},{2,5,0},{10,9,8}}, new int[][]{{2,11,3},{15,10,7},{9,17,12},{8,1,14}});
    }

//    int[] res;
//    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
//        if (requirements.length==0)
//            return new int[0];
//        res = new int[requirements.length];
//        Arrays.fill(res, -1);
//        if (increase.length==0)
//            return res;
//        for (int i = 1; i < increase.length; i++) {
//            increase[i][0]+=increase[i-1][0];
//            increase[i][1]+=increase[i-1][1];
//            increase[i][2]+=increase[i-1][2];
//        }
//        pplus(increase[increase.length-1][0],increase[increase.length-1][1],increase[increase.length-1][2],requirements,increase.length-1);
//        for (int i = increase.length-1; i >=0; i--) {
//            plus(increase[i][0],increase[i][1],increase[i][2],requirements,i);
//        }
//        plus(0,0,0,requirements,-1);
//
//        return res;
//    }
//    void plus(int c,int r,int h,int[][] requirements,int index){
//        for (int i = 0; i < res.length; i++) {
//            if (res[i]==-1)
//                continue;
//            if (c>=requirements[i][0]&&r>=requirements[i][1]&&h>=requirements[i][2])
//            {
//                res[i]=index+1;
//            }
//        }
//    }
//    void pplus(int c,int r,int h,int[][] requirements,int index){
//        for (int i = 0; i < res.length; i++) {
//            if (c>=requirements[i][0]&&r>=requirements[i][1]&&h>=requirements[i][2])
//            {
//                res[i]=index+1;
//            }
//        }
//    }
//
//    public static void main(String arg[]){//main--来自高金磊
//
//        new third().getTriggerTime(new int[][]{{2,8,4},{2,5,0},{10,9,8}}, new int[][]{{2,11,3},{15,10,7},{9,17,12},{8,1,14}});
//    }
}
