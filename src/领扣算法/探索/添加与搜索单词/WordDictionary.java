/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.添加与搜索单词;

import java.util.HashMap;
import java.util.HashSet;

class WordDictionary {
    HashMap<Character,Node> data;
    HashSet<String> flag;
    /** Initialize your data structure here. */
    public WordDictionary() {
        flag=new HashSet<>();
        data = new HashMap<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        HashMap<Character,Node> middle=data;
        flag.add(word);
        Node m=new Node();
        for (char c : word.toCharArray()) {
            if (!middle.containsKey(c))
            {
                middle.put(c, new Node());
            }
            m=middle.get(c);
            middle=m.map;
        }
        m.last = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    char[] chars;
    public boolean search(String word) {
        chars=word.toCharArray();
        return plus(chars[0], data,0,"");
    }

    private boolean plus(char c,HashMap<Character,Node> map,int index,String ss){
        if (map==null)
            return false;
        if (c=='.'){
            if (index==chars.length-1&&map.size()>0)
            {
                for (Character character : map.keySet()) {
                    if (flag.contains(ss+character))
                        return true;
                }

                return false;
            }
            boolean b=false;
            for (Character character : map.keySet()) {
                if (!b)
                    b=plus(chars[index+1],map.get(character).map,index+1,ss+character);
            }
            return b;
        }
        else {
            if (map.containsKey(c)){
                if (index==chars.length-1)
                    return flag.contains(ss+c);
                return plus(chars[index+1],map.get(c).map,index+1,ss+c);
            }else return false;
        }
    }

    class Node{
        HashMap<Character,Node> map;
        boolean last=false;
        public Node(){
            map=new HashMap<>();
        }
    }

}
