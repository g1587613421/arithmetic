/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.剪绳子;

public class Main {
    public int cuttingRope(int n) {
        //DP
        if (n<=3)
            return n-1;
        int data[]=new int[n];
        data[0]=1;
        data[1]=2;
        data[2]=3;
        for (int i = 3; i < n; i++) {
            int max=1;
            for (int j = 0; j < i; j++) {
                max=Math.max(max, data[j]*(i-j));
            }
            data[i]=max;
        }
        return data[n-1];
    }
    //非DP
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) Math.pow(3, quotient);
        } else if (remainder == 1) {
            return (int) Math.pow(3, quotient - 1) * 4;
        } else {
            return (int) Math.pow(3, quotient) * 2;
        }
    }
//    public static void main(String arg[]){//main--来自高金磊
//
//        new Main().cuttingRope(6);
//    }

//    public int cuttingRope(int n) {
//        int nn=n;
//        if (n==2)
//            return 1;
//        int middle=(int) Math.pow(n, 0.5);
//        int res=1;
//        while (n-middle>middle)
//        {
//            res*=middle;
//            n-=middle;
//        }
//        int res1=1;
//        middle++;
//        while (nn>middle)
//        {
//            res1*=middle;
//            nn-=middle;
//        }
//        return Math.max(Math.max(res*n, res*(middle-1)*(n-middle+1)),res1*(nn<=0?1:nn));
//    }
}
