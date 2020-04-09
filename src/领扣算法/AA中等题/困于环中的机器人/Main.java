/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.困于环中的机器人;

public class Main {
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        int dirction=0;
        for (char c : instructions.toCharArray()) {
            switch (c) {
                case 'L':
                    dirction--;
                    break;
                case 'R':
                    dirction++;
                    break;
                case 'G':
                    dirction=dirction<0?dirction+4:dirction;
                    switch (dirction % 4) {
                        case 0:
                            x++;
                            break;
                        case 1:
                            y++;
                            break;
                        case 2:
                            x--;
                            break;
                        case 3:
                            y--;
                            break;

                    }

            }

        }
        return (x==0&&y==0)||dirction%4!=0;
    }
    
    
//    public static void main(String arg[]){//main--来自高金磊
//
//       new Main().isRobotBounded("GLRLLGLL");
//    }
}
