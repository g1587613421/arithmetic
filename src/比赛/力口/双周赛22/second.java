/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛22;

import java.util.ArrayList;
import java.util.HashMap;

public class second {
    HashMap<Integer, ArrayList<Integer>> data=new HashMap<>();
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        for (int[] reservedSeat : reservedSeats) {
            ArrayList<Integer> mm=data.getOrDefault(reservedSeat[0],new ArrayList<>());
            mm.add(reservedSeat[1]);
            data.put(reservedSeat[0],mm);
        }
        int count=0;
        for (int i = 1; i < n+1; i++) {
            ArrayList<Integer> middle=data.getOrDefault(reservedSeats[i],new ArrayList<>());
            for (int j = 2; j < 7; j++) {
                if (j==3||j==5)
                    continue;
                if (!middle.contains(j)&&!middle.contains(j+1)&&!middle.contains(j+2)&&!middle.contains(j+3)){
                    count++;
                    j+=3;
                }
            }

        }
        return count;
    }
}
