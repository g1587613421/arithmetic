/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.MapSumPairs;

import java.util.HashMap;

class MapSum {
    HashMap<Character,Node> data;
    HashMap<String,Integer> flags;
    /** Initialize your data structure here. */
    public MapSum() {
        data=new HashMap<>();
        flags=new HashMap<>();
    }

    public void insert(String key, int val) {
        int fl=flags.getOrDefault(key, 0);
        HashMap<Character,Node> mHa=data;
        for (char c : key.toCharArray()) {
            Node middle=mHa.getOrDefault(c, new Node(c));
            middle.count+=val-fl;
            mHa.put(c, middle);
            mHa=middle.map;
        }
        flags.put(key, val);
    }

    public int sum(String prefix) {
        Node node=null;
        HashMap<Character,Node> map=data;
        for (char c : prefix.toCharArray()) {
            if (!map.containsKey(c))
                return 0;
            else {
                node=map.get(c);
                map = node.map;
            }
        }
        return node==null?0:node.count;
    }
    class Node{
        public char aChar;
        public int count;
       public HashMap<Character,Node> map;
        public Node(char c){
            map=new HashMap<>();
            aChar=c;
            count=0;
        }
    }
}