package 比赛.first.second;

import java.util.Scanner;


public class Main {
    public static void main(String arg[]){//main--来自高金磊
        Scanner input=new Scanner(System.in);
        int T=Integer.valueOf(input.next());//几条边
        int[] Es=new int[T];
        int a=0;
        for (int n=0;n<T;n++){
            input.nextInt();
            input.nextInt();
            Es[n]= input.nextInt();
            a=n%2==0?a+Es[n]:a-Es[n];
        }
        a=a/2;
        System.out.println(a);
        for (int n=0;n<T-1;n++){
            a=Es[n]-a;
            System.out.println(a);
        }
    }
}

