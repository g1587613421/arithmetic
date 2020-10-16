/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.警告一小时内使用相同员工卡大于等于三次的人;

import java.util.*;

public class Main {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        int time[]=new int[keyTime.length];
        for (int i = 0; i < keyName.length; i++) {
            time[i]=FormTranslet(keyTime[i]);
        }
//        int day=0;//时间片偏移
//        for (int i = 1; i < time.length; i++) {
//            //日期矫正
//            while (time[i]+24*60*day<time[i-1]){
//                day+=2;
//            }
//            time[i]+=day*60*24;
//
//        }
        HashMap<String, LinkedList<Integer>> data=new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            LinkedList<Integer> middle=data.getOrDefault(keyName[i],new LinkedList<Integer>());
            middle.addLast(time[i]);
            data.put(keyName[i],middle);
        }
        LinkedList<String> res=new LinkedList<>();
        for (String s : data.keySet()) {
            if (check(data.getOrDefault(s, new LinkedList<>()))){
                res.addLast(s);
            }
        }
        Collections.sort(res);
        return res;
    }

    private boolean check(LinkedList<Integer> orDefault) {
        if (orDefault.size()<3)
            return false;
        Integer[] middle=new Integer[orDefault.size()];
        orDefault.toArray(middle);
        Arrays.sort(middle);
        for (int i = 2; i < middle.length; i++) {
            if (middle[i]-middle[i-2]<=60)
                return true;
        }


        return false;

    }

    private int FormTranslet(String s) {
        String[] middle=s.split(":");
        return Integer.valueOf(middle[0])*60+Integer.valueOf(middle[1]);
    }
}
