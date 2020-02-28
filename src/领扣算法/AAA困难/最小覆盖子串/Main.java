/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.最小覆盖子串;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    HashMap<Character, LinkedList<Integer>> data=new HashMap<>();
    int min_=Integer.MAX_VALUE;
    int start,end;
    public String minWindow(String s, String t) {
        if (t.length()>s.length())
            return "";
        if (s.contains(t))
            return t;
        char[] middle=s.toCharArray();
        for (int i = 0; i < middle.length; i++) {
            if (t.contains(""+middle[i])){
                LinkedList<Integer> linkedList=data.getOrDefault(middle[i],new LinkedList<Integer>());
                linkedList.addLast(i);
                data.put(middle[i],linkedList);
            }

        }
        if (data.keySet().size()!=t.length())
            return "";
        LinkedList<Character> target=new LinkedList<>(data.keySet());

        for (int i = 0; i < data.get(target.getFirst()).size(); i++) {
            LinkedList<Integer> path=new LinkedList<>();
            path.add(data.get(target.getFirst()).get(i));
            LinkedList<Character> list=new LinkedList<>(target);
            list.removeFirst();
            plus(list, path);
        }
        return s.substring(start, end+1);

    }
    private void plus(LinkedList<Character> target,LinkedList<Integer> path){
        Collections.sort(path);
        if (target.size()==0)
        {

            int siz=path.getLast()-path.getFirst();
            if (siz<min_){
                min_=siz;
                start=path.getFirst();
                end=path.getLast();
            }
            return;
        }
        if (path.getLast()-path.getFirst()>=min_)
            return;

        for (Integer integer : data.get(target.getFirst())) {
            LinkedList<Character> middle=new LinkedList<>(target);
            middle.removeFirst();
            LinkedList<Integer> middle2=new LinkedList<>(path);
            middle2.add(integer);
            plus(middle, middle2);
        }


    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().minWindow("ADOBECODEBANC","ABC"));
    }
}
