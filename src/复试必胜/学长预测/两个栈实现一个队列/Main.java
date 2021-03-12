/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.两个栈实现一个队列;

import java.util.Stack;

public class Main {
   private Stack<Integer> num1,num2;
    public Main(){

        num1 = new Stack<>();
        num2 = new Stack<>();
    }
    public void addLast(Integer num){
        num1.push(num);
    }
    public void addFirst(Integer num){
        while (!num1.isEmpty())
            num2.push(num1.pop());
        num1.push(num);
        while (!num2.isEmpty())
            num1.push(num2.pop());
    }
    public Integer pollFirst(){
        if (num1.isEmpty())
            return -1;
        while (!num1.isEmpty())
            num2.push(num1.pop());
        Integer middle=num2.pop();
        while (!num2.isEmpty())
            num1.push(num2.pop());
        return middle;
    }
    public Integer poll(){
        if (num1.isEmpty())
            return -1;
        return num1.pop();
    }
    public static void main(String arg[]){//main--来自高金磊

        //test
        Main main=new Main();
        for (int i = 0; i < 10; i++) {
            main.addLast(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(main.pollFirst());
            System.out.println(main.poll());
        }
    }

}
