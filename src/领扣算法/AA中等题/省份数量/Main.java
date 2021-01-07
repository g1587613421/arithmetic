/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.省份数量;

import java.util.LinkedList;

public class Main {
    public int findCircleNum(int[][] isConnected) {
        boolean[] flag=new boolean[isConnected.length];
        LinkedList<Integer> data=new LinkedList<>();
        int count=0;
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i])
            {
                count++;
                data.add(i);
                flag[i]=true;
                while (!data.isEmpty()){
                    int mid=data.pollFirst();
                    for (int j = 0; j < isConnected.length; j++) {
                        if (isConnected[mid][j]==1&&!flag[j]){
                            flag[j]=true;
                            data.add(j);
                        }
                    }
                }
            }
        }
        return count;
    }
}
