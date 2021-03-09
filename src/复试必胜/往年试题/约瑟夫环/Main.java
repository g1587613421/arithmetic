/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.约瑟夫环;

import java.util.LinkedList;

public class Main {
    private String fo(int sum,int size,int start){
        //暴力
        //模拟
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i < sum; i++) {
            linkedList.addLast(i);
        }
        while (start-->0){
            linkedList.addLast(linkedList.pollFirst());
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!linkedList.isEmpty()){
            for (int i = 0; i < size-1; i++) {
                linkedList.addLast(linkedList.pollFirst());
            }
            stringBuilder.append(linkedList.peekFirst());
            System.out.println(linkedList.pollFirst());
        }
        return stringBuilder.toString();
    }
    //数学计算--略
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().fo(10, 5, 2));
    }
}
