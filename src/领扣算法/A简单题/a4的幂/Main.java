package 领扣算法.A简单题.a4的幂;

public class Main {
    public boolean isPowerOfFour(int num) {
        String middle=Integer.toBinaryString(num);
        if (!middle.contains("1")||middle.lastIndexOf("1")!=middle.indexOf("1"))
            return false;
        return middle.length()%2==1;
    }
}
