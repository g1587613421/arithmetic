/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.第N个泰波那契数;

public class Main {
    int one=0,two=1,three=1,middle;
    public int tribonacci(int n) {
      if (n==1)
          return 0;
      if (n==2||n==3)
          return n-1;
      n=n-3;
        for (int i = 0; i < n; i++) {
            one+=three+two;
            middle=one;
            one=two;
            two=three;
            three=middle;
        }
return three;
    }
}
