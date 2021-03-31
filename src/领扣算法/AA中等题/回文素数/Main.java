/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.回文素数;

public class Main {
    public int primePalindrome(int N) {
        if (N<2)
            return 2;
        while (true)
        {

            if (new StringBuilder(""+N).reverse().toString().equals(""+N)&&plus(N)){
                return N;
            }
            N++;

        }
    }

    private boolean plus(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String arg[]){//main--来自高金磊

        new Main().primePalindrome(6);
    }
}
