package 领扣算法.AA中等题.回文数;

public class Main {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        if (x<10)
            return true;
        char[] chars= String.valueOf(x).toCharArray();
        for (int n=0;n<chars.length/2;n++)
        {
            if (chars[n]!=chars[chars.length-1-n])
                return false;
        }

        return true;
    }
}
