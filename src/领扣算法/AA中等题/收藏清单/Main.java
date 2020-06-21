/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.收藏清单;

import java.util.*;

public class Main {
    HashMap< HashSet<String>,Integer> data=new HashMap<>();
    LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int n=0;
        for (List<String> favoriteCompany : favoriteCompanies) {
            HashSet<String> middle=new HashSet<>();
            for (String s : favoriteCompany) {
                middle.add(s);
            }
            data.put(middle,n++);
        }
        LinkedList<HashSet<String>> list=new LinkedList<>(data.keySet());
        Collections.sort(list, (a,b)->(a.size()-b.size()));
        for (int i = 0; i < list.size(); i++) {
            HashSet<String> set1=list.get(i);
            int j;
            for (j = i+1; j < list.size(); j++) {
                if (list.get(j).containsAll(set1)){
                    break;
                }
            }
            if (j==list.size()){
                res.addLast(data.get(set1));
            }

        }
        Collections.sort(res);
        return res;
    }
}
