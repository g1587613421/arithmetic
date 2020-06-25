/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.制作m束花所需的最少天数;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k)
            return -1;//can't reach
        HashMap<Integer,Integer> basedate=new HashMap<>();
        for (int i : bloomDay) {
            basedate.put(i,basedate.getOrDefault(i, 0)+1);
        }
        LinkedList<Integer> middle_base_date=new LinkedList<>(basedate.keySet());
        Collections.sort(middle_base_date,(z,x)->(x-z));
        StringBuffer middle=new StringBuffer();
        for (int i = 0; i < k; i++) {
            middle.append("1");
        }
        String sp=middle.toString();
        int res=middle_base_date.getFirst();
        for (Integer integer : middle_base_date) {
            StringBuffer buffer=new StringBuffer();
            for (int i : bloomDay) {
                buffer.append(i<=integer?"1":"0");
            }
            buffer.append("e");
            if (buffer.toString().split(sp).length>m)
            {
                res=integer;
            }
            else return res;
        }
        return res;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().minDays(new int[]{1,10,3,10,2},3,1);
    }
}
