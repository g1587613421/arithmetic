/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.三角形最小路径和;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public int minimumTotal(List<List<Integer>> triangle) {
        LinkedList<Integer> data=new LinkedList<>(),linkedList=new LinkedList<>();
        data.add(triangle.get(0).get(0));
        List<Integer> middle;
        for (int i = 1; i < triangle.size(); i++) {
            int num=Integer.MAX_VALUE;
            middle=triangle.get(i);
            linkedList.add(middle.get(0)+data.get(0));
            for (int j = 1; j < middle.size()-1; j++) {
                linkedList.add(Math.min(data.get(j-1)+middle.get(j), middle.get(j)+data.get(j)));
            }
            linkedList.add(middle.get(middle.size()-1)+data.getLast());
            data.clear();
            data.addAll(linkedList);
            linkedList.clear();
        }
        int res=data.pollFirst();
        for (Integer integer : data) {
            res=Math.min(res, integer);
        }
        return res;
    }


}
