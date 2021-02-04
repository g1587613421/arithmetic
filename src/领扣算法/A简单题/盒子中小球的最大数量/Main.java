/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.盒子中小球的最大数量;

import java.util.Collections;
import java.util.HashMap;

public class Main {

    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> data=new HashMap<>();
        int index=0;
        for (int i = lowLimit; i <=highLimit; i++) {
           index=plus(i);
           data.put(index, data.getOrDefault(index, 0)+1);
        }
        return Collections.max(data.values());
    }

    int middle;
   int plus(int num){
        middle=0;
        while (num>0)
        {
            middle+=num%10;
            num/=10;
        }
        return middle;
   }
}
