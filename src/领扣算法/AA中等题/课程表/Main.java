/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.课程表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main
{
    HashMap<Integer, ArrayList<Integer>> data=new HashMap<>();
    LinkedList<Integer> flag;
    boolean res=true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int[] prerequisite : prerequisites) {
            ArrayList<Integer> middle=data.getOrDefault(prerequisite[0],new ArrayList<>());
            middle.add(prerequisite[1]);
            data.put(prerequisite[0],middle);
        }
        flag=new LinkedList<>(data.keySet());
        while (!flag.isEmpty()){
            plus(flag.pop(),new ArrayList<>());
        }
        return res;
    }

    void plus(int now,ArrayList<Integer> ls){
        if (!res)
            return;
        ls.add(now);
        ArrayList<Integer> target=data.getOrDefault(now, new ArrayList<>());
        for (Integer integer : target) {
                flag.remove(integer);
                if (ls.contains(integer)) {
                    res = false;
                    return;
                }
                
                plus(integer, new ArrayList<>(ls));

        }
    }
    
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().canFinish(2, new int[][]{{1,0},{0,1}});
    }
}
