/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛176;

import java.util.ArrayList;

public class thrid {
    ArrayList<Integer> date=new ArrayList<>(),middle;
    int max=0;
    public int maxEvents(int[][] events) {
        for (int i = events[0][0]; i <=events[0][1]; i++) {
            middle=new ArrayList<>(date);
            middle.add(i);
            plus(middle, 1,events);
        }
        return max;
    }

    void plus(ArrayList d,int i,int[][] events){
        boolean b=false;
        max=Math.max(max, d.size());
        if (i>=events.length||max-d.size()>=events.length-i)
           return;
        else {
            for (int j = events[i][0]; j <= events[i][1]; j++) {
                if (!d.contains(j)){
                    b=true;
                    middle=new ArrayList<>(d);
                    middle.add(j);
                    plus(middle, i+1, events);
                }
            }
            if (!b)
                plus(d, i+1, events);
        }
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new thrid().maxEvents(new int[][]{{1,4},{4,4},{2,2},{3,4},{1,1}}));
    }
}
