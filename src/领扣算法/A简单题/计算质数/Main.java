package 领扣算法.A简单题.计算质数;

public class Main {

    public int countPrimes(int n) {
        if(n==1||n==2||n==0)
            return 1;
        boolean ns[]=new boolean[n+1];
        for (int i = 3; i < ns.length; i++) {
            if (!ns[i]){
                int middle=i+i;
                while (middle<=n){
                    ns[middle]=true;
                    middle+=i;
                }
            }
        }
        int sum=0;
        for (boolean b : ns) {
            if (!b)
                sum++;
        }
        return sum<=0?0:sum-2;//去ns[0,1]
    }
}
