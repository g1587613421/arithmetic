package 比赛.全国大学生程序设计大赛.区域赛;

import java.util.Scanner;

public class one {
    
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int L=scanner.nextInt();
        int Z=scanner.nextInt();
        
        int A,B;
        B=(6*L-Z)/14;
        A=L-3*B;
        
        System.out.print(A+" "+B);

        
    }
}
