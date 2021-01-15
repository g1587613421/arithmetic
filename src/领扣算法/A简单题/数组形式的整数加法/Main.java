/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.数组形式的整数加法;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> data=new LinkedList<>();
        int flag=0;
        int middle=0;
        for (int i = A.length-1; i >=0; i--) {
            middle=A[i]+flag+K%10;
            flag=middle/10;
            K/=10;
            data.addFirst(middle%10);
        }
        while (K>0){
            middle=flag+K%10;
            flag=middle/10;
            K/=10;
            data.addFirst(middle);
        }
        if (flag>0){
            data.addFirst(flag);
        }
     return data;
    }
}
