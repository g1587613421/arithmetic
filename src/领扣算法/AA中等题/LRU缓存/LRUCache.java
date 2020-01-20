package 领扣算法.AA中等题.LRU缓存;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer,Integer> {
    int cap;
    public LRUCache(int capacity) {
    super(capacity,0.75f,true);
    cap=capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>cap;
    }
}
