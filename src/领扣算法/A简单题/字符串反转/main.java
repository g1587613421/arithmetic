package 领扣算法.A简单题.字符串反转;

public class main {
    public void reverseString(char[] s) {
        char middle;
        for (int i = 0; i < s.length/2; i++) {
            middle=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=middle;
        }
    }
}
