/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.完全平方数;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public int numSquares(int n) {
        if (n==0)
            return 0;
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if (i*i<=n)
                data.add(i*i);
            else break;
        }
        LinkedList<Integer> res = new LinkedList<>(),middle=new LinkedList<>();
        HashSet<Integer> scrap=new HashSet<>();
        int count=0;
        res.add(0);
        while (res.size()>0){
            count++;
            for (Integer re : res) {
                for (Integer datum : data) {
                    int nu=re+datum;
                    if (nu==n)
                        return count;
                    else if (nu<n&&!scrap.contains(nu)) {
                        middle.add(nu);
                        scrap.add(nu);
                    }
                }
            }
            if (middle.contains(n))
                return count;
            res.clear();
            res.addAll(middle);
            middle.clear();
        }


        return -1;

    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().numSquares(12);
    }
}
