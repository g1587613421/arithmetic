/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.质数排列;

public class Main {

    public int numPrimeArrangements(int n) {
        int sum = 0;
        if (n > 2){
            sum = fun(n);
        }else {
            return 1;
        }
        long cur = 1L;
        for (int i = 2;i <= sum; i++){
            cur = (cur * i) % (1000000000 + 7);
        }
        for (int i = 2;i <= n - sum; i++){
            cur = (cur * i) % (1000000000 + 7);
        }
        return  (int)cur;
    }

    public int fun (int n){
        n += 1;
        int sum = 0;
        boolean[] bool = new boolean[n+1];
        for (int i = 2;i < n; i++){
            if (bool[i] == false){
                sum ++;
                for (int j = 2; j*i < n; j++) {
                    bool[j*i] = true;
                }
            }
        }
        return sum;
    }
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().numPrimeArrangements(100));
    }

}
