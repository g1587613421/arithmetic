/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛185;

import java.util.*;

public class second {
    public List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<String,HashMap<String,Integer>> data=new HashMap<>();
        HashSet<String> foodname=new HashSet<>(),id=new HashSet<>();
        for (List<String> order : orders) {
            foodname.add(order.get(2));
            id.add(order.get(1));
            HashMap<String,Integer> oldor=data.getOrDefault(order.get(1), new HashMap<>());
            oldor.put(order.get(2), oldor.getOrDefault(order.get(2), 0)+1);
            data.put(order.get(1), oldor);
        }
        List<List<String>> result=new LinkedList<>();
        LinkedList<String> res=new LinkedList<>(),food=new LinkedList<>(foodname);
        Collections.sort(food);
        res.addFirst("Table");
        res.addAll(food);
        result.add(res);
        LinkedList<String> tabid=new LinkedList<>(id);
        Collections.sort(tabid,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                if (o1.length()!=o2.length())
                    return o1.length()-o2.length();
                return o1.compareTo(o2);
            }
        });
        for (String s : tabid) {
            res=new LinkedList<>();
            res.add(s);
            HashMap<String,Integer> order=data.get(s);
            for (String s1 : food) {
                res.add(""+order.getOrDefault(s1, 0));
            }
            result.add(res);
        }


        return result;
    }
}
