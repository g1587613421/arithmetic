/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.设计哈希集合;

import java.util.LinkedList;

public class MyHashSet {
    LinkedList<Integer>[] data;
        /** Initialize your data structure here. */
        public MyHashSet() {
            data = new LinkedList[10];
            for (int i = 0; i < data.length; i++) {
                data[i]=new LinkedList<>();
            }
        }

        public void add(int key) {
            if (!contains(key))
           data[key%10].addLast(key);
        }

        public void remove(int key) {
            data[key%10].remove(new Integer(key));
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return data[key%10].contains(key);
        }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
