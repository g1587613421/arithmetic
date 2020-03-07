/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.总持续时间可被60整除的歌曲;

import java.util.HashMap;

public class Main {


    //超时
//    public int numPairsDivisibleBy60(int[] time) {
//        int pre,count=0;
////        boolean[] flag=new boolean[time.length];
//        for (int i = 0; i < time.length; i++) {
////            if (flag[i])
////                continue;
//            pre=time[i];
//            for (int j = i+1; j < time.length; j++) {
////                if (flag[j])
////                    continue;
//                if ((time[j]+pre)%60==0)
//                {
//                    count++;
////                    flag[i]=flag[j]=true;
//                }
//            }
//        }
//
//        return count;
//    }


    //这个地方如果用数组(大小是60)来代替HashMap将能有很大提高
    HashMap<Integer,Integer> data=new HashMap<>();
    public int numPairsDivisibleBy60(int[] time) {
        for (int i : time) {
            data.put(i%60,data.getOrDefault(i%60, 0)+1);
        }
        int count=0;
        for (Integer integer : data.keySet()) {
            if (integer>=30)
                continue;
                count+=data.get(integer)*data.getOrDefault(60-integer,0);
        }
        int middle=0;
        middle=data.getOrDefault(0,1);
        count+=(middle*(middle-1))/2;
            middle= data.getOrDefault(30,1);
            count+=(middle*(middle-1))/2;

        return count;
    }
}
