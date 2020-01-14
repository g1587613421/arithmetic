package 领扣算法.AA简单题.阶乘0;

public class Main {
    int sum=0;
    public int trailingZeroes(int n) {
     while (n>=5){
         n/=25;
         if (n>=5)
         sum+=n*5+n;
         else n*=25;
         n/=5;
         sum+=n;
     }
     return sum;
    }
}
