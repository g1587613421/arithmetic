/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.常数时间插入删除和获取随机元素;

import java.util.ArrayList;

class RandomizedSet {
    ArrayList<Integer> data;
    /** Initialize your data structure here. */
    public RandomizedSet() {

        data = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (data.contains(val))
            return false;
        data.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!data.contains(val))
            return false;
        data.remove(new Integer(val));
        return true;

    }

    /** Get a random element from the set. */
    public int getRandom() {
        return data.get(((int)(Math.random()*(data.size()))));
    }


    public static void main(String arg[]){//main--来自高金磊

        // 初始化一个空的集合。
        RandomizedSet randomSet = new RandomizedSet();

// 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomSet.insert(1);

// 返回 false ，表示集合中不存在 2 。
        randomSet.remove(2);

// 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomSet.insert(2);

// getRandom 应随机返回 1 或 2 。
        randomSet.getRandom();

// 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomSet.remove(1);

// 2 已在集合中，所以返回 false 。
        randomSet.insert(2);

// 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        randomSet.getRandom();
    }
}
