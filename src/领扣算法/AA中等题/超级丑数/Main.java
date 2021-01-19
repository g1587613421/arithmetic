/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.超级丑数;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int mm = 0,max=Integer.MAX_VALUE;
        int middle;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue();
        priorityQueue.add(1);
        HashSet<Integer> hashSet=new HashSet<>();
        while (true) {
            if (--n==0){
                return priorityQueue.poll();
            }
            middle = priorityQueue.poll();
            for (Integer integer : primes) {
                mm = integer*middle;
                if (!hashSet.contains(mm)) {
                    priorityQueue.add(mm);
                    hashSet.add(mm);
                }
            }
            max=mm;
        }
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().nthSuperUglyNumber(100000,new int[]{7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251});
    }
}
