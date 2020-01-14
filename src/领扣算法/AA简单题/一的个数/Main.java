package 领扣算法.AA简单题.一的个数;

public class Main {
    int sum=0;
    public int hammingWeight(int n) {
        if (n<0) {
           n=~n;
           sum=32;
        }
        while (n!=0){
            sum+=n&1;
            n=n>>1;
        }
        return sum>32?64-sum:sum;
    }
}
