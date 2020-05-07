/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.x的平方根;

public class Main {
    public int mySqrt(int x) {
        long pre=0;
        long last=x/2+1;
        while (pre<=last){
            assert pre==46340;
            long middle=(pre+last)/2;
            if (middle*middle>x)
                last=middle-1;
            else if (middle*middle==x)
                return (int) middle;
            else pre=middle+1;
        }
        return (int)Math.min(pre, last);
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().mySqrt(2147395600);
    }
}
