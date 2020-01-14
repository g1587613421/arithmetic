package 领扣算法.AA简单题.快乐数;

public class Main {
    /*
    0.8
    0.25
     */
//    ArrayList<Integer> middle=new ArrayList<>();
//    char aChar[];
//    public boolean isHappy(int n) {
//        if (middle.indexOf(n)==-1)
//            middle.add(n);
//        else
//            return false;
//        aChar=(""+n).toCharArray();
//        if (n==1)
//            return true;
//        n=0;
//        for (char c : aChar) {
//            n+=(c-'0')*(c-'0');
//        }
//        return isHappy(n);
//    }
    int middle=0;
    char aChar[];
    public boolean isHappy(int n) {
        if (middle==n)
            return false;
        if (middle==0)
            middle=n;

        aChar=(""+n).toCharArray();
        if (n==1)
            return true;
        n=0;
        for (char c : aChar) {
            n+=(c-'0')*(c-'0');
        }
        return isHappy(n);
    }
}
