/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.优势洗牌;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    LinkedList<Integer> nums=new LinkedList<>();
    LinkedList<Integer> last=new LinkedList<>();
    public int[] advantageCount(int[] A, int[] B) {

        Arrays.sort(A);
        for (int i : A) {
            nums.addLast(i);
        }
        int[][] dataB = new int[B.length][2];
        for (int i = 0; i < B.length; i++) {
            dataB[i]=new int[]{i,B[i]};
        }
        Arrays.sort(dataB,(a,b)->Integer.compare(a[1],b[1]));

        int middle;
        for (int i = 0; i < A.length; i++) {
//            System.out.println(i);
            middle=plus(dataB[i][1]);
            dataB[i][1]=middle;
        }
        for (int i = 0; i < dataB.length; i++) {
            A[dataB[i][0]]=dataB[i][1];
        }

        return A;
    }
    int ta;
    int plus(int target){
        ta=Integer.MIN_VALUE;
        while (ta<=target&&nums.size()>0){
            ta=nums.pollFirst();
            last.addLast(ta);
        }
        ta=last.removeLast();
        return ta;
    }
    
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().advantageCount(new int[]{2,0,4,1,2},new int[]{1,3,0,0,2});
    }
}
