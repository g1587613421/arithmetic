/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.数字拆解;

public class Main {
    public static void f(int n, int[] a, int k) {
        if (n <= 0) {
            for (int i = 0; i < k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }
        for (int i = n; i >= 1; i--) {
            if (k > 0 && i > a[k - 1])
                continue;
            a[k] = i;
            f(n - i, a, k + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[1000];
        f(6, a, 0);
    }

}
