/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.构造矩形;

public class Main {

    public int[] constructRectangle(int area) {
        int i=1,j=area;
        int W=i,L=area;
        while (i++<=j){
            int num=area/i;
            if (num*i==area)
            {
                j=num;
                W=i;
                L=j;
            }
        }

        return new int[]{W,L};
    }
}
