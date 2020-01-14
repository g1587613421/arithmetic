package 比赛.全国大学生程序设计大赛.区域赛;

import java.util.Scanner;

public class two {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int middle,res=0;
        boolean ns[]=new boolean[m+1];//为true的不可以
        for (int i = 2; i < ns.length; i++) {
            if (!ns[i]){
                middle = i+i;
                while (middle<=m){
                    ns[middle]=true;
                    middle+=i;
                }
            }

        }
        for (int j = n; j <=m; j++) {
            if (ns[j]&&((j&1)==1))
                res++;
        }

        System.out.print(res);
    }
}
