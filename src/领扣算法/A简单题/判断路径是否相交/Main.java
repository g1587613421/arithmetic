/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.判断路径是否相交;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    HashMap<Integer, HashSet<Integer>> data=new HashMap<>();
    public boolean isPathCrossing(String path) {
        char[] chars=path.toCharArray();
        int x=0,y=0;
        HashSet middle=data.getOrDefault(0, new HashSet<>());
        middle.add(0);
        data.put(0, middle);
        for (char aChar : chars) {
            switch (aChar){
                case 'N':
                    x++;
                    middle=data.getOrDefault(x, new HashSet<>());
                    if (middle.contains(y)) {
                        return true;
                    }else {
                        middle.add(y);
                        data.put(x, middle);
                    }
                    break;
                case 'S':
                    x--;
                    middle=data.getOrDefault(x, new HashSet<>());
                    if (middle.contains(y)) {
                        return true;
                    }else {
                        middle.add(y);
                        data.put(x, middle);
                    }
                    break;
                case 'E':
                    y++;
                    middle=data.getOrDefault(x, new HashSet<>());
                    if (middle.contains(y)) {
                        return true;
                    }else {
                        middle.add(y);
                        data.put(x, middle);
                    }
                    break;
                case 'W':
                    y--;
                    middle=data.getOrDefault(x, new HashSet<>());
                    if (middle.contains(y)) {
                        return true;
                    }else {
                        middle.add(y);
                        data.put(x, middle);
                    }
                    break;
            }
        }
        return false;
    }
}
