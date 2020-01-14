package 比赛.全国大学生程序设计大赛.往年试题;

import java.util.Scanner;

public class 质数个数{

    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long time=System.currentTimeMillis();
        System.out.println(plus(n));
        System.out.println("执行时间:"+(-time+System.currentTimeMillis())+"ms");


    }

    private static int plus(int n) {
        boolean ns[]=new boolean[n+1];
        for (int i = 2; i < ns.length; i++) {
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
        return sum==0?0:sum-2;//去ns[0,1]
    }

}
