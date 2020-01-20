package 领扣算法.AA中等题.计算各个位数不同的数字个数;

public class Main {

    int result=0,re=0;
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0)
            return 1;
        if (n==1)
            return 10;
        result=81;
        re=91;
        for (int i = 2; i < n; i++) {
            result*=(10-i);
            re+=result;
        }
        return re;
    }
}
