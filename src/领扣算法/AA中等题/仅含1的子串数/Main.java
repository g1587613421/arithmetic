/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.仅含1的子串数;

import java.util.ArrayList;

public class Main {
    public int numSub(String s) {
        ArrayList<Integer> data=new ArrayList<Integer>(s.length()/3);
        int count=0;
        int max=0;
        for (char c : s.toCharArray()) {
            switch (c){
                case '1':
                    count++;
                    break;
                case '0':
                    data.add(count);
                    max=Math.max(max, count);
                    count=0;
            }
        }
        data.add(count);
        max=Math.max(max, count);
        //加速器
        long num[]=new long[max+1];
        for (int i = 1; i < num.length; i++) {
            num[i]=num[i-1]+i;
        }
        //计算结果
        long res=0L;
        for (Integer datum : data) {
            if (datum>=1)
            res+=num[datum];
        }
        return (int) (res%1000000007);
    }
}
