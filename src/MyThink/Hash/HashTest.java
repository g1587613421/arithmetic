/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.Hash;

import Tools.SimpleTimeTest;

import java.util.HashSet;

public class HashTest {
    public static void main(String arg[]){//main--来自高金磊
        //功能测试:
        MyHashSetClass myHashSetClass=new MyHashSetClass();
        Object o=new Object();
        myHashSetClass.add(o);
        for (int i = 0; i < 10000; i++) {
            myHashSetClass.add(new Object());
        }
        System.out.println(myHashSetClass.contains(o));
        System.out.println(myHashSetClass.remove(o));
        System.out.println(myHashSetClass.remove(o));

        SimpleTimeTest.TestMethod();
        MyHashSetClass<Object> myHashSetClass1=new MyHashSetClass<>(100);
        for (int i = 0; i < 100; i++) {
            Object o1=new Object();
            for (int j = 0; j < 1000; j++) {
                myHashSetClass.add(new Object());
            }
            for (int j = 0; j < 10; j++) {
                myHashSetClass.remove(new Object());
            }
            myHashSetClass.remove(o1);
        }
        SimpleTimeTest.endMethod("我的HashSet简单的读写性能测试");

        SimpleTimeTest.TestMethod();
        HashSet<Object> hashSet=new HashSet<>(100);
        for (int i = 0; i < 100; i++) {
            Object o1=new Object();
            for (int j = 0; j < 1000; j++) {
                hashSet.add(new Object());
            }
            for (int j = 0; j < 10; j++) {
                hashSet.remove(new Object());
            }
            hashSet.remove(o1);
        }
        SimpleTimeTest.endMethod("官方HashSet简单的读写性能测试");




    }
}
