package 比赛.全国大学生程序设计大赛.区域赛;

import java.util.Scanner;

public class four {
    
    public static void main(String arg[]){//main--来自高金磊

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int data[]=new int[n];
        for (int i = 0; i < n; i++) {
            data[i]=scanner.nextInt();
        }
        int mi,ma,DK=0;
        for (int i = 0; i <= n-k; i++) {
            mi=ma=data[i];
            for (int j = i+1; j < i+k; j++) {
                mi=Math.min(mi, data[j]);
                ma=Math.max(ma, data[j]);
            }
            DK=Math.max(DK, ma-mi);
        }
        System.out.println(DK);
    }
}
