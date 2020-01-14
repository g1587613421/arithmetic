package 比赛.first.th;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        Scanner input=new Scanner(System.in);
        int T=Integer.valueOf(input.next());//几组数据
        int r[]=new int[T];
        for (int n=0;n<T;n++){
            int nn=input.nextInt();
            int m=input.nextInt();
            r[n]=recursion(m)/recursion(m-nn)*Power(m-2, nn-2);
        }
        for (int rr:r) {
            System.out.println(rr);
        }
    }
    public static int recursion(int num){//利用递归计算阶乘
     int sum=1;
     if (num==0)
         return 1;
        if(num < 0)
            throw new IllegalArgumentException("必须为正整数!");//抛出不合理参数异常
        if(num==1){
            return 1;//根据条件,跳出循环
        }else{
            sum=num * recursion(num-1);//运用递归计算
            return sum;

        }

    }
    public static int Power(int base, int exponent){
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }


}
