/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.List.MyJavaClass.MyLinkList;

import Tools.SimpleTimeTest;

import java.util.LinkedList;

public class Test {
    public static void main(String arg[]){//main--来自高金磊
//        System.out.println("功能测试:");
        MyLinkListClass myLinkListClass=new MyLinkListClass<Integer>();
//        myLinkListClass.addLast(1);
//        myLinkListClass.addLast(1);
//        myLinkListClass.addFirst(2);
//        myLinkListClass.addFirst(2);
//        myLinkListClass.addFirst(2);
//        System.out.println(""+myLinkListClass.poll());
//        System.out.println(""+myLinkListClass.poll());
//        System.out.println(""+myLinkListClass.poll());
//        System.out.println(myLinkListClass.peek());
//        System.out.println(""+myLinkListClass.poll());
//        System.out.println(""+myLinkListClass.poll());
//        System.out.println(""+myLinkListClass.poll());
//        MyLinkListClass myLinkListClass1= new MyLinkListClass<Integer>();
//        myLinkListClass1.add(1111);
//        myLinkListClass.addAll(myLinkListClass1);
//        System.out.println(myLinkListClass.pollLast());


        SimpleTimeTest.TestMethod();
        LinkedList<Integer> linkedList =new LinkedList<Integer>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {//写入测试
                linkedList.addLast(i);
                linkedList.addFirst(i);
            }
            for (int j = 0; j < 100; j++) {//查找测试
                linkedList.get(i*2);
            }
            for (int j = 0; j < 10; j++) {//删除
                linkedList.remove(new Integer(i*i));
                linkedList.pollFirst();
                linkedList.pollLast();
            }
        }
        SimpleTimeTest.endMethod("java官方LinkList基本操作性能:");
        SimpleTimeTest.TestMethod();
        myLinkListClass=new MyLinkListClass<Integer>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {//写入测试
                myLinkListClass.addLast(i);
                myLinkListClass.addFirst(i);
            }
            for (int j = 0; j < 100; j++) {//查找测试
                myLinkListClass.get(i*2);
            }
            for (int j = 0; j < 10; j++) {//删除
                myLinkListClass.remove(i*i);
                myLinkListClass.pollFrist();
                myLinkListClass.pollLast();
            }
        }
        SimpleTimeTest.endMethod("myLinkListClass基本操作性能:");
    }
}
