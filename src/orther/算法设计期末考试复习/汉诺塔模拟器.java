/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

import java.util.LinkedList;
import java.util.Scanner;

public class 汉诺塔模拟器 {
    LinkedList<Integer> pallar1=new LinkedList<>();
    LinkedList<Integer> pallar2=new LinkedList<>();
    LinkedList<Integer> pallar3=new LinkedList<>();

    private void init(int size){
        for (int i = size; i >0; i--) {
            pallar1.push(i);
        }
        print();
    }
    private void next() throws Exception {
        if (!pallar1.isEmpty()&&pallar1.peek()==1){
            pallar2.push(pallar1.poll());
            move2(pallar1, pallar3);
        }else if (!pallar2.isEmpty()&&pallar2.peek()==1){
            pallar3.push(pallar2.poll());
            move2(pallar1, pallar2);
        }else {
            pallar1.push(pallar3.poll());
            move2(pallar2, pallar3);
        }
        
    }
    private void move2(LinkedList<Integer> A,LinkedList<Integer> B) throws Exception {
        if (A.isEmpty()&&B.isEmpty()){
            print();
            throw new Exception("游戏已结束");
        }
        if (A.isEmpty()){
            A.push(B.poll());
            return;
        }
        if (B.isEmpty()){
            B.push(A.poll());
            return;
        }
        if (A.peek()<B.peek())
        {
            B.push(A.poll());
            return;
        }
        A.push(B.poll());
    }

    private void print(){
        System.out.print("柱子1:");
        for (Integer integer : pallar1) {
            System.out.print("---"+integer);
        }
        System.out.println();
        System.out.print("柱子2:");
        for (Integer integer : pallar2) {
            System.out.print("---"+integer);
        }
        System.out.println();
        System.out.print("柱子3:");
        for (Integer integer : pallar3) {
            System.out.print("---"+integer);
        }
        System.out.println();
    }
    
    public static void main(String arg[]){//main--来自高金磊
        汉诺塔模拟器 hnt=new 汉诺塔模拟器();
        System.out.println("输入游戏规模:");

        Scanner scanner=new Scanner(System.in);
        hnt.init(scanner.nextInt());
        try {
            while (true){
                System.out.println("输入n显示下一步,输入all显示全部");
                String target=scanner.next();
                if (target.equals("n")){
                    hnt.next();
                    hnt.print();
                }
                else if (target.equals("all")){
                    System.out.println("输入显示时间间隔(ms)--建议300");
                    int t=scanner.nextInt();
                    while (true){
                        try {
                            Thread.sleep(t);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        hnt.next();
                        hnt.print();
                    }
                }
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        
    }
}
