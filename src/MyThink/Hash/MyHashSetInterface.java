/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.Hash;

public interface MyHashSetInterface <T>{
    //使用一个数组通过拉链法实现hashSet的基本操作,要求能指定初始值大小
    //必须完成的优化:当有一组的长度大于数组的长度时主动调整函数并适当调整空间
    boolean contains(T t);
    boolean  add(T t);//如果有同样Hash的对象(他自己)存在返回false并不再增加
    int addAll(MyHashSetInterface myHashSetInterface);//返回成功插入的个数
    int size();
    void clear();
    boolean remove(T t);
    boolean isEmpty();
    void Expansion ();//优化hash
    int hasHashCode(T t);//哈希函数--尽可能实现最优--哈希值使用Java自带的
}
