/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.实现Trie前缀树;

import java.util.HashMap;
import java.util.HashSet;

class Trie {
    HashMap<Character,HashMap> data;
    HashSet<String> res;
    /** Initialize your data structure here. */
    public Trie() {
        data=new HashMap<>();
        res=new HashSet<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        res.add(word);
        HashMap<Character, HashMap> middle=data;
        for (char c : word.toCharArray()) {
            if (!middle.containsKey(c))
            {
                middle.put(c, new HashMap());
            }
            middle=middle.get(c);
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return res.contains(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        HashMap<Character, HashMap> middle = data;
        for (char c : prefix.toCharArray()) {
            if (!middle.containsKey(c))
                return false;
            middle=middle.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */