/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.避免洪水泛滥;

import java.util.HashSet;
import java.util.LinkedList;

public class Main
{
    public int[] avoidFlood(int[] rains) {
        int count=0;//Give priority to water pumping to eliminate flooding
        HashSet<Integer> repeat_check=new HashSet<>();
        LinkedList<Integer> stack=new LinkedList<>();
        int middle =0;
        for (int i = 0; i < rains.length; i++) {
            if (rains[i]>0){
                if (repeat_check.contains(rains[i])){
                    if (count<=0){
                        return new int[0];
                    }
                    else {
                        count--;
                        stack.addLast(rains[i]);
                    }
                }else {
                    repeat_check.add(rains[i]);
                }
                rains[i]=-1;//
                middle++;
            }else{
                if (middle-count>0)//还有水能抽
                {
                    count++;
                    middle--;
                    rains[i]=0;
                }else {
                    rains[i]=1;
                }

                //暂时什么也不做
            }
        }

        for (int i = 0; i < rains.length; i++) {
            if (rains[i]==0){
                if (!stack.isEmpty()){
                    if (stack.size()>1){
                        rains[i]=stack.pollFirst();
                    }
                    else {
                        rains[i]=stack.peekFirst();
                    }
                }
                else rains[i]=1;

            }
        }
        return rains;
    }
}
