/*
 * Copyright (c) 2021.版权所有高金磊
 */

package MyThink.JVM.Lambda表达式的使用;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class lambda {
    
    public static void main(String arg[]){//main--来自高金磊
    //用于匿名内部类
        //使用监听器
        new Button("").addActionListener(event->System.out.println(event.getID()));
        new Button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getID());
            }
        });

        //使用数组排序
        Arrays.sort(new Integer[10], (a,b)->a-b);
    }
}
