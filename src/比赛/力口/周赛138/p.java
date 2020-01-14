package 比赛.力口.周赛138;

public class p {

    public int numWays(int steps, int arrLen) {
        arrLen--;
       int sum=0;
       if (arrLen>=steps)
        return plus(steps, steps);
       else
           return plus(steps, steps)-plus(steps-arrLen, steps-arrLen);
    }
    public int plus(int steps, int arrLen){
        int sum=0;
        int b=steps/2;
        if (b<=0)
            b=1;
        int a=steps;
        while (a>b){
            sum+=dg(a,b);
            a-=b;
        }


        return sum;
    }

    public static int dg(int a, int b) {
                if (b == 0)
                     return 1;
                else if (a == 1)
                     return 1;
                else if (a == b)
                     return 1;
                 else
                     return dg(a-1,b-1)+dg(a-1,b);
    }
    public static void main(String arg[]){//main--来自高金磊

        System.out.println(new p().dg(4,2));
    }
}
