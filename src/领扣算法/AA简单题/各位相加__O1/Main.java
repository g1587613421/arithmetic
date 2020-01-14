package 领扣算法.AA简单题.各位相加__O1;

public class Main {

    public int addDigits(int num) {
    return num%9==0?(num==0?0:9):num%9;
    }
}
