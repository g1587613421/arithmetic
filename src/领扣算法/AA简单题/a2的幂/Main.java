package 领扣算法.AA简单题.a2的幂;

public class Main {
    public boolean isPowerOfTwo(int n) {
        if (n==0)
            return false;
        while (n%2==0)
            n/=2;
        return n==1;
    }
}
