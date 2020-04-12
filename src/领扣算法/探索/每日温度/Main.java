/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.每日温度;

import java.util.LinkedList;

public class Main {
    public int[] dailyTemperatures(int[] T) {
        LinkedList<Integer> data = new LinkedList<>();
        int max=T[T.length-1];
        for (int i =T.length-1; i >=0; i--) {
            if (T[i]>=max)
            {
                data.clear();
                data.addFirst(T[i]);
                max=T[i];
                T[i]=0;
            }else {
                int count=1;
                for (Integer datum : data) {
                    if (datum<=T[i]){
                        count++;
                    }
                    else break;
                }
                data.addFirst(T[i]);
                T[i]=count;
            }
        }
        return T;
    }
}
