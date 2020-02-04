package 领扣算法.A简单题.x的平方数;

public class Main {
    //牛顿迭代法
        int s;

        public int mySqrt(int x) {
            s=x;
            if(x==0) return 0;
            return ((int)(sqrts(x)));
        }

        public double sqrts(double x){
            double res = (x + s / x) / 2;
            if (res == x) {
                return x;
            } else {
                return sqrts(res);
            }
        }

}
