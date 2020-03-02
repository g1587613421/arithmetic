/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.整数的各位积和之差;

public class Main {
    public int subtractProductAndSum(int n) {
        int product=1,sum=0;
        for (char c : (""+n).toCharArray()) {
            product*=(c-'0');
            sum+=(c-'0');
        }
        return product-sum;
    }
}
