/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.JVM;

public class main {
   static volatile Object o=new Object(),o1=new Object();
    public static void main(String arg[]){//main--来自高金磊

//        try {
//            Thread.sleep(10000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //死锁实例
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (o){
                        System.out.println("1已经拿到o");
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (o1){
                            o1=o1;
                            System.out.println("1已经拿到o1");
                        }
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (o1){
                        System.out.println("2已经拿到o1");
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (o){
                            o1=o1;
                            System.out.println("2已经拿到o");

                        }
                    }
                }
            }
        }.start();

    }
}
