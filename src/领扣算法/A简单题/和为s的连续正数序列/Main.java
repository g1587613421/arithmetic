/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.和为s的连续正数序列;

import java.util.LinkedList;

public class Main {
    //最小前缀和
    public int[][] findContinuousSequence(int target) {
        LinkedList<LinkedList<Integer>> linkedList=new LinkedList();
        int data[]=new int[target/2+2];
        data[0]=1;
        for (int i = 1; i < data.length; i++) {
            data[i]=data[i-1]+i;
        }
        int n=0,m=1;
        while (n<data.length&&m<data.length){
            if (data[m]-data[n]>target)
                n++;
            else
            if (data[m]-data[n]<target)
                m++;
            else
            {
                LinkedList<Integer> res=new LinkedList<>();
                res.add(n);
                res.add(m);
                linkedList.add(res);
                m++;
                n++;
            }

        }
        int result[][]=new int[linkedList.size()][];
        for (int i = 0; i < result.length; i++) {
            int nn=linkedList.get(i).get(0);
            int mm=linkedList.get(i).get(1);
            int middle[]=new int[mm-nn];
            for (int j = 0; j < middle.length; j++) {
                middle[j]=j+nn;
            }
            result[i]=middle;
        }
        return result;
    }
}
