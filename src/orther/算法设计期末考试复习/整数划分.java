/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 整数划分 {

    private int soult(int n){
        return soult(n, n);
    }
   private int soult(int n,int m){
       if (n==1||m==1)
           return 1;
       if (n<m)
           return soult(n, n);
       if (n==m)
           return soult(n, m-1)+1;
       return soult(n-m, m)+soult(n, m-1);
   }


   public static void main(String arg[]){//main--来自高金磊
      System.out.println(new 整数划分().soult(4));

   }
}
