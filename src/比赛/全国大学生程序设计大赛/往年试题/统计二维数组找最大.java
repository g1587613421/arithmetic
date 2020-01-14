package 比赛.全国大学生程序设计大赛.往年试题;

import java.util.Scanner;

public class 统计二维数组找最大 {
    public static void main(String arg[]){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int nums[][]=new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                nums[i][j]=scanner.nextInt();
            }
            
        }
        int max=0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                try {
                  max= Math.max(max, nums[i][j]+nums[i+1][j]+nums[i+2][j]);
                }catch (Exception e){

                }
                try {
                   max= Math.max(max, nums[i][j]+nums[i][j+1]+nums[i][j+2]);
                }catch (Exception e){

                }


            }
        }
        System.out.println(max);

    }
}
