package 比赛.全国大学生程序设计大赛.区域赛;

import java.util.Scanner;

public class three {
    public static void main(String arg[]){//main--来自高金磊
        String data= new Scanner(System.in).nextLine();
        int a,b,c;
        a=b=c=0;
        for (char ch : data.toCharArray()) {
            if (('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')){
                a++;
                continue;
            }
            if ('0'<=ch&&ch<='9'){
                b++;
                continue;
            }
            if (ch!=' ')
                c++;
        }
        System.out.println("a-z "+a);
        System.out.println("0-9 "+b);
        System.out.println("others "+c);

    }
}
