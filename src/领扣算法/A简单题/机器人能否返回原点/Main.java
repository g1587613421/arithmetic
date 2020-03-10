/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.机器人能否返回原点;

public class Main {

    public boolean judgeCircle(String moves) {
        int h=0;
        int v=0;
        for (char c : moves.toCharArray()) {
            switch (c){
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                case 'L':
                    h--;
                    break;
                case 'R':
                    h++;
            }

        }
        return h==0&&v==0;
    }
}
