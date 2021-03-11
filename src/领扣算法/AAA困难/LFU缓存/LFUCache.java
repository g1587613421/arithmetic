/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AAA困难.LFU缓存;

import java.util.HashMap;
import java.util.LinkedList;

class LFUCache {
    HashMap<Integer,Integer> data=new HashMap<>();
    LinkedList<Integer> cache;
    int maxsize=0;
    public LFUCache(int capacity) {
        cache = new LinkedList<>();
        maxsize=capacity;
    }


    public int get(int key) {
        if (cache.contains(key)) {
            cache.remove(cache.indexOf(key));
            cache.addFirst(key);
            return data.get(key);
        }
        else
            return -1;
    }

    public void put(int key, int value) {
        if (cache.contains(key))
            data.put(key, value);
        if (cache.size()>=maxsize){
            cache.pollLast();
            cache.addFirst(key);
            data.put(key, value);
        }
        else {
            cache.addFirst(key);
            data.put(key, value);
        }
    }
}
