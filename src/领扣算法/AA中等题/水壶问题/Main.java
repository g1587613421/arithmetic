/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.水壶问题;

public class Main {

    public boolean canMeasureWater(int x, int y, int z) {
        if (x+y<z)
            return false;
        if (x==0||y==0){
            return x+y==z||z==0;
        }
        while (x!=y){
            if (x>y)
            {
                int middle=x;
                x=y;
                y=middle;
            }
            y=y-x;
        }
       return z%y==0;
    }
}
