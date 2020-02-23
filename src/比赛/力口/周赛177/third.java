/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛177;

public class third {
    public int[] closestDivisors(int num) {
        int f1=plus(num+1);
        int f2=(num+1)/f1;
        int s1=plus(num+2);
        int s2=(num+2)/s1;
        return Math.abs(f1-f2)>Math.abs(s1-s2)?new int[]{s1,s2}:new int[]{f1,f2};
    }

    static int plus(int num){
        int nu=1;
        int cou=1;
        while ((num/cou)>nu){
            cou++;
            if (num%cou==0)
                nu=cou;
        }
        return nu;
    }
}
