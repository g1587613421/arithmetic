/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.速算机器人;

public class Main {
    public int calculate(String s) {
        int x=1,y=0;
//        "A" 运算：使 x = 2 * x + y；
//        "B" 运算：使 y = 2 * y + x。

        for (char c : s.toCharArray()) {
            switch (c){
                case 'A':
                    x=2*x+y;
                    break;
                case 'B':
                    y=2*y+x;
                    break;
            }
        }
        return x+y;
    }
}
