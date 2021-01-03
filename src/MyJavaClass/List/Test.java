/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyJavaClass.List;

import Tools.SimpleTimeTest;

import java.util.ArrayList;

public class Test {

    public static void main(String arg[]){//main--来自高金磊
//        SimpleTimeTest.TestMethod();
//        MyArrayListClass<Integer> data,middle;
//        for (int n = 0; n < 1000; n++) {
//            data = new MyArrayListClass<Integer>();
//            for (int i = 0; i < 10000; i++) {
//                data.add(i);
//                data.addFirst(i*3);
//            }
//            for (int i = 0; i < 1000; i++) {
//                data.poll();
//                data.pollFrist();
//                data.pollLast();
//                data.peek();
////            System.out.println(data.remove(55));
//                data.remove(i*4);
//            }
//            for (int i = 0; i < 5000; i++) {
//                data.insert(i*3, i*8);
//            }
//            middle=new MyArrayListClass<>();
//            middle.addAll(data);
//            data=middle;
//        }
//        SimpleTimeTest.endMethod("压力测试结果:");


        SimpleTimeTest.TestMethod();
        ArrayList<Integer> dd=new ArrayList<>(4);
        for (int i = 0; i < 100000; i++) {
            dd.add(i);
            dd.add(i+500);
//            dd.remove(i*2);
        }
        SimpleTimeTest.endMethod("写入压力测试");
        SimpleTimeTest.TestMethod();
        MyArrayListClass<Integer> data=new MyArrayListClass<>(1024);
        for (int i = 0; i < 100000; i++) {
            data.add(i);
            data.add(i+500);
//            data.remove(i*6);
        }
        SimpleTimeTest.endMethod("写入压力测试");
//        SimpleTimeTest.TestMethod();
//        ArrayList<Integer> data1,middle1;
//        for (int n = 0; n < 1000; n++) {
//            data1 = new ArrayList<>()
//            ;
//            for (int i = 0; i < 10000; i++) {
//                data1.addL(i);
//                data1.add(i*3);
//            }
//            for (int i = 0; i < 1000; i++) {
//                data1.poll();
//                data1.pollFirst();
//                data1.pollLast();
//                data1.peek();
////            System.out.println(data.remove(55));
//                data1.remove(i*4);
//            }
//            for (int i = 0; i < 5000; i++) {
//                data1.addFirst(i*8);
//            }
//            middle1=new LinkedList<>();
//            middle1.addAll(data1);
//            data1=middle1;
//        }
//        SimpleTimeTest.endMethod("压力测试结果:");
    }

}
