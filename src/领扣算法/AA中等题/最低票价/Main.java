/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最低票价;

import java.util.ArrayList;

public class Main {

    public int mincostTickets(int[] days, int[] costs) {
        ArrayList<Integer> day=new ArrayList<>();
        for (int i : days) {
            day.add(i);
        }
        int[] day_Cost = new int[366];
        day_Cost[0]=0;
        for (int i = 1; i < day_Cost.length; i++) {
            if (!day.contains(i))
                day_Cost[i]=day_Cost[i-1];
            else {
                day.remove(new Integer(i));
                day_Cost[i]=day_Cost[i-1]+costs[0];
                if (i>=8){
                    day_Cost[i]=Math.min(day_Cost[i],day_Cost[i-7]+costs[1]);
                }else day_Cost[i]=Math.min(day_Cost[i],day_Cost[0]+costs[1]);
                if (i>=31){
                    day_Cost[i]=Math.min(day_Cost[i],day_Cost[i-30]+costs[2]);
                }
                else day_Cost[i]=Math.min(day_Cost[i],day_Cost[0]+costs[2]);
                if (day.isEmpty())
                    return day_Cost[i];
            }
        }
        return day_Cost[day_Cost.length-1];
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().mincostTickets(new  int[]{1,4,6,7,8,20},new int[]{2,7,15});
    }
}
