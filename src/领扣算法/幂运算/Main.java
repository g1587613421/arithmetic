package 领扣算法.幂运算;

public class Main {
    public double myPow(double x, int n) {
        //数据预处理
        if (n==0)
            return 1;
        if (x==1){
            return 1;
        }
        if (x==-1){
            return n%2==0?1:-1;
        }
        if (n<0){
            x=1/x;
            n=-n;
        }

        double res=x;
        while (n--!=1){
            if (res==0)
                return 0;
            res*=x;
        }

        return res;
    }

    public static void main(String arg[]){//main--来自高金磊
     new Main().myPow(2.0, -2);

    }
    //栈溢出
//    double plus(double x,int n){
//        if (n==1)
//            return x;
//        else return plus(x, n-1)*x;
//    }
}
