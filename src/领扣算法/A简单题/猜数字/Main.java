/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.猜数字;

public class Main {

    public int game(int[] guess, int[] answer) {
        return (guess[0]!=answer[0]?0:1)+(guess[1]!=answer[1]?0:1)+(guess[2]!=answer[2]?0:1);
    }
}
