/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.账户合并;

import java.util.*;

public class Main {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, LinkedList<HashSet<String>>> data=new HashMap<>();
        //只有名字相同的才可能发生合并
        for (List<String> account : accounts) {
            LinkedList<HashSet<String>> middle=data.getOrDefault(account.get(0), new LinkedList<>());
            HashSet<String> hashSet=new HashSet<>(account);
            hashSet.remove(account.get(0));
            middle.add(hashSet);
            data.put(account.get(0), middle);
        }
        List<List<String>> result=new LinkedList<>();
        for (Map.Entry<String, LinkedList<HashSet<String>>> stringLinkedListEntry : data.entrySet()) {
            String name=stringLinkedListEntry.getKey();
            LinkedList<HashSet<String>> accs=stringLinkedListEntry.getValue();
            for (int i = 0; i < accs.size(); i++) {
                HashSet<String> hashSet=accs.get(i);
                for (int j = i+1; j < accs.size(); j++) {
                    HashSet hashSet1=accs.get(j);
                    int count=hashSet1.size();
                    hashSet1.addAll(hashSet);
                    if (hashSet.size()+count==hashSet1.size())
                    {
                        hashSet1.removeAll(hashSet);
                    }else {
                        hashSet.clear();
                    }
                }
            }
            LinkedList<String> res;
            for (HashSet<String> acc : accs) {
                if (acc.isEmpty())
                    continue;
                res = new LinkedList<>(acc);
                res.addFirst(name);
                result.add(res);
            }
        }
        Collections.sort(result, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        return result;
    }
    public static void main(String arg[]){//main--来自高金磊

    }
}
