package 比赛.first;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]){//main--来自高金磊
        Scanner input=new Scanner(System.in);
        int T=Integer.valueOf(input.next());//几组数据
        int[] v=new int[T];//记录胜场数
        for (int n=0;n<T;n++){
            v[n]=compute(input.nextInt(),input.nextInt(),input.nextInt(),input.next());
        }

        for (int n=0;n<T;n++){
            System.out.println(v[n]);
        }
    }
    public static int compute(int N,int K,int M,String s){
        char[] cs=s.toCharArray();
        int k=K;
        int v=0;
        int maxv=0;
        for (int m=0;m<M;m++){
            k=K;//归0
        for (char c: cs) {
            v=c=='1'?++v:(k-->0?v:--v);
           maxv=maxv>v?maxv:v;
        }
        }
        if (maxv>0)
            return maxv;
        return 0;
    }
}
