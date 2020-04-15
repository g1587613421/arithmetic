/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.钥匙和房间;

import java.util.HashSet;
import java.util.List;

public class Main {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size()<=1)
            return true;
        boolean flags[]=new boolean[rooms.size()];
        HashSet<Integer> data=new HashSet<>(rooms.get(0));
        flags[0]=true;
        boolean b=true;
        while (b){
            b=false;
            for (int i = 0; i < flags.length; i++) {
                if (!flags[i]&&data.contains(i)){
                    flags[i]=true;
                    data.addAll(rooms.get(i));
                    b=true;
                }
            }
        }
        for (boolean flag : flags) {
            if (!flag)
                return false;
        }
        return true;
    }
}
