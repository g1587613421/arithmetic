package 比赛.全国大学生程序设计大赛.往年试题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 首字母排序 {

    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();
        ArrayList<String> data=new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            data.add(scanner.next());
        }
        Collections.sort(data);
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
