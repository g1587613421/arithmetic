package 领扣算法.AA中等题.平方根;

public class Main {
    public int mySqrt(int x) {
        int res=1;
        while (res*res++<x);
        if (res*res==x)
            return res-1;
        return res-2;

    }
    public static void main(String arg[]){//main--来自高金磊

System.out.println();
    }
}
