/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 大整数乘法 {//演示--不做具体实现

    private static long Calculate(long a,long b){//标砖的是此处参数改成用字符串

        int len=Long.bitCount(a);

        if (len<=3)
            return a*b;
        long B=a&((2<<(len/2+1))-1);
        long A=(a>>(len/2));

        long D=b&((2<<(len/2+1))-1);
        long C=(b>>(len/2));

        long res;
        res=((A*C)<<len)+((A*D+B*C)<<(len/2))+B*D;
        return res;
    }

    public static void main(String arg[]){//main--来自高金磊
        long num1=12345678L;
        long num2=12345678L;

        //err
        System.out.println("系统直接乘积的得到答案:     "+num1*num2);
        System.out.println("Calculate(long a,long b):   "+Calculate(num1,num2));

    }

}
