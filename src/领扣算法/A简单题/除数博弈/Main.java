/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.除数博弈;

public class Main {

    public boolean divisorGame(int N) {
        boolean[] b = new boolean[N + 1];
        b[0]=b[1]=false;
        for (int i = 2; i <b.length; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    if (!b[i-j])
                    {
                        b[i]=true;
                        break;
                    }
                }
            }
        }
        return b[b.length-1];
    }
}
