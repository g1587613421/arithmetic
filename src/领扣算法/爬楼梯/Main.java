package 领扣算法.爬楼梯;

public class Main {//未通过

    //斐波那契解法
    public int climbStairss(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public int climbStairs(int n) {
        //n台阶总数
        int x=1;//一次两个台阶的数量
        long sum=0;
        for (;x <=n-x; x++) {
            try {
                sum+=(middle(n-x,n-x-x+1)/(middle(x,1)));
            }catch (Exception e){
                System.out.println(x);
                System.out.println(n-x);
            }

        }
        return Integer.valueOf(""+(sum+1));
    }

    public long middle(int m,int E){
        if (m==1||m==0){
            return 1;
        }
        if (m==E){
            return E;
        }
        return m*middle(m-1,E);
    }
    public static void main(String arg[]){//main--来自高金磊
     System.out.println(new Main().climbStairs(8));

    }
}
