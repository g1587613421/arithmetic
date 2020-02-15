/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.丑数II;

import java.util.PriorityQueue;

public class Main {
PriorityQueue<Integer> data=new PriorityQueue<>();
    public int nthUglyNumber(int n) {
       n--;
       data.add(1);
        for (;  n>0 ; n--) {
            int middle=data.poll();
            if (middle<Integer.MAX_VALUE/2&&!data.contains(middle*2))
                data.add(middle*2);
            if (middle<Integer.MAX_VALUE/3&&!data.contains(middle*3))
                data.add(middle*3);
            if (middle<Integer.MAX_VALUE/5&&!data.contains(middle*5))
                data.add(middle*5);
        }
        return data.peek();
    }

    public static void main(String arg[]){//main--来自高金磊

        System.out.println(new Main().nthUglyNumber(10));
    }


//    LinkedList<Integer> data=new LinkedList<>(),middle=new LinkedList<>();
//    int target=0;
//    int[] nums=new int[]{};
//    public int nthUglyNumber(int n) {
//        data.addLast(1);
//        while (target==0||data.size()<n||data.get(n)!=target){
//
//            if (data.size()>=n)
//                target=data.get(n);
//            plus();
//        }
//        return data.get(n-1);
//    }
//    void plus(){
//        middle.clear();
//        middle.addAll(data);
//        for (Integer datum : data) {
//
//            if (datum*2<Integer.MAX_VALUE)
//            middle.addLast(datum*2);
//            if (datum*3<Integer.MAX_VALUE)
//            middle.addLast(datum*3);
//            if (datum*5<Integer.MAX_VALUE)
//            middle.addLast(datum*5);
//        }
//        data.clear();
//        data.addAll(middle);
//    }

}
