/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.二进制间距;

import java.util.ArrayList;

public class Main {
    public int binaryGap(int N) {
        int pos=0;
        ArrayList<Integer> data=new ArrayList<>();
        while (N!=0){
            if ((N&1)==1){
                data.add(pos++);
            }
            else
                pos++;
            N>>=1;
        }
        int max=0;
        for (Integer datum : data) {
            max=Math.max(max, datum-pos);
            pos=datum;
        }
        return max;
    }
}
