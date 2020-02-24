/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.根据身高重建队列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    ArrayList<int[]> res=new ArrayList<>();
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        for (int[] person : people) {
            res.add(person[1],person);
        }
        for (int i = 0; i < people.length; i++) {
            people[i]=res.get(i);
        }
        return people;
    }
}
