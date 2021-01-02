/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.错题复做;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> data=new LinkedList<>();
        for (int[] interval : intervals) {
            data.addFirst(interval);
        }
        Collections.sort(data, (a, b)->a[0]-b[0]);
        LinkedList<int[]> res=new LinkedList<>();
        while (data.size()>1){
            int[] m1=data.pollFirst();
            int[] m2=data.pollFirst();
            if (m1[1]>=m2[0]){
                m1[1]=Math.max(m1[1],m2[1]);
                data.addFirst(m1);
                continue;
            }
            res.addFirst(m1);
            data.addFirst(m2);
        }
        if (!data.isEmpty())
            res.add(data.pollFirst());
        int[][] result=new int[res.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i]=res.pollFirst();
        }
        return result;
    }

}
