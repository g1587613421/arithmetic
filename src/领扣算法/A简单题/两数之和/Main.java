package 领扣算法.A简单题.两数之和;

public class Main {
    int res;
    public int getSum(int a, int b) {
        while(b!=0)
        {
            res= (a&b)<<1;
            a = a^b;
            b = res;
        }
        return a;
    }

}
