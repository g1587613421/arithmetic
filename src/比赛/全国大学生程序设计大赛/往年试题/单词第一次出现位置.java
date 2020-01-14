package 比赛.全国大学生程序设计大赛.往年试题;

import java.util.Scanner;

public class 单词第一次出现位置 {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        String data="";
        String traget="";
        String middle="";
        while (true)
        {
            middle=scanner.nextLine();
            if (!middle.contains("!"))
            {
                data+=middle;
            }
            else{
                data+=middle;
                break;
            }

        }
        traget=scanner.next();
        System.out.println(data.indexOf(traget)+1);

    }
}
