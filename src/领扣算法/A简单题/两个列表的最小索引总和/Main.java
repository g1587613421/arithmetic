/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.两个列表的最小索引总和;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> data=new HashMap<>(),data1=new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            data.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            data1.put(list2[i],i);
        }
        List<String> res=new LinkedList<>(data.keySet());
        List<String> res1=new LinkedList<>(data1.keySet());
        res.retainAll(res1);
        int middle=Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        res1.clear();
        for (String re : res) {
            middle=Math.min(middle, data.get(re)+data1.get(re));
            map.put(re, data.get(re)+data1.get(re));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue()==middle)
                res1.add(stringIntegerEntry.getKey());
        }
        String s[] = new String[res1.size()];
        res1.toArray(s);
        return s;
    }
}
