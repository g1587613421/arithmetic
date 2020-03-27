/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.卡牌分组;

import java.util.HashMap;

public class Main {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int i : deck) {
            data.put(i, data.getOrDefault(i, 0)+1);
        }
        int min=-1;
        for (Integer value : data.values()) {
            if (min==-1){
                min=value;
                continue;
            }
            if (value==1||min==1)
                return false;
            min=plus(min, value);
        }
        return min>=2;
    }
    private int plus(int A,int B){
        int C=0;
        if (A==0||B==0)
            return 0;
        if (A==1||B==1)
            return A*B;
        while (A!=B){
            if (A<B){
                C=A;
                A=B;
                B=C;
            }
            A-=B;
        }

        return A;
    }
}
