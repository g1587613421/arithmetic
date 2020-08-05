/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.找出数组游戏的赢家;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public int getWinner(int[] arr, int k) {
        if (arr.length<2)
            return arr[0];
        if (k>=arr.length)
            return Arrays.stream(arr).max().getAsInt();
        //data-init
        LinkedList<Integer> data=new LinkedList<>();
        int count=0;
        for (int i : arr) {
            data.addLast(i);
        }
        int now_int=data.pollFirst();
        while (count!=k){
            int new_=data.pollFirst();
            if (new_>now_int){
                count=1;
                data.addLast(now_int);
                now_int=new_;
            }
            else {
                count++;
                data.addLast(new_);
            }

        }
        return now_int;
    }
}
